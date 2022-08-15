import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Main {
    //Verificando se existe conta, caso contrario sera criado;
    private static final String sqlCreate = "DROP TABLE IF EXISTS Conta; "
            + "CREATE TRABLE Conta"
            + "("
            + "id INT PRIMARY KEY,"
            + " nome VARCHAR (100) NOT NULL,"
            + "sobrenome VARCHAR (100) NOT NULL,"
            + "matricula VARCHAR (100) NOT NUL"
            + ");";
    private static final String sqlInsert = "INSERT INTO Dentista (id,nome,sobrenome,matricula) VALUES (?,?,?);";

    private static final String sqlUpdate = "UPDATE Dentista SET matricula = ? WHERE id = ?;";

    public static void main(String[] args) throws Exception {
        Dentista conta = new Dentista("Eduardo", "Fontes", "23dsfer36", 5);
        Connection connection = null;

        try {
            connection = ConnectionJDBC.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreate);

            PreparedStatement preparedStatementInsert = connection.prepareStatement(sqlInsert);

            preparedStatementInsert.setString(1, conta.getName());
            preparedStatementInsert.setString(2, conta.getSobrenome());
            preparedStatementInsert.setString(3, conta.getMatricula("321Teste"));
            preparedStatementInsert.setInt(4, conta.getId());
            preparedStatementInsert.execute();


            PreparedStatement preparedStatementUpdate = connection.prepareStatement(sqlUpdate);
            preparedStatementUpdate.setString(1, conta.getMatricula("321Teste"));
            preparedStatementUpdate.setInt(2, conta.getId());
            preparedStatementUpdate.execute();



             resultSet

        } catch (Exception e) {
            e.printStackTrace();
            connection.rollback();

        } finally {
            connection.close();
        }
    }
}