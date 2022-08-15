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
            + "numeroConta VARCHAR (100) NOT NULL,"
            + "saldo NUMERIC (15,2)"
            + ");";
    private static final String sqlInsert = "INSERT INTO Conta (id,nome,numeroConta,saldo) VALUES (?,?,?,?);";

    private static final String sqlUpdate = "UPDATE Conta SET saldo = ? WHERE id = ?;";

    public static void main(String[] args) throws Exception {
        Conta conta = new Conta("Daniel", 1, "23dsfer36", 30);
        Connection connection = null;

        try {
            connection = ConnectionJDBC.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreate);

            PreparedStatement preparedStatementInsert = connection.prepareStatement(sqlInsert);
            preparedStatementInsert.setInt(1, conta.getId());
            preparedStatementInsert.setString(2, conta.getNome());
            preparedStatementInsert.setString(3, conta.getNumeroConta());
            preparedStatementInsert.setDouble(4, conta.getSaldo());
            preparedStatementInsert.execute();


            PreparedStatement preparedStatementUpdate = connection.prepareStatement(sqlUpdate);
            preparedStatementUpdate.setDouble(1, conta.aumentarSaldo(10));
            preparedStatementUpdate.setInt(2, conta.getId());
            preparedStatementUpdate.execute();

            //Para comitar
            connection.setAutoCommit(false);
            PreparedStatement preparedStatementUpdates2 = connection.prepareStatement(sqlUpdate);
            preparedStatementUpdates2.setDouble(1, conta.aumentarSaldo(15));
            preparedStatementUpdates2.setInt(2, conta.getId());
            preparedStatementUpdates2.execute();

            // int erro = 20/0;
            connection.commit();
            connection.setAutoCommit(true);

        } catch (Exception e) {
            e.printStackTrace();
            connection.rollback();

        } finally {
            connection.close();
        }
    }
}