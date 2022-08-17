import java.sql.*;

public class Main {
    //Verificando se existe conta, caso contrario sera criado;
    private static final String sqlCreate = "DROP TABLE IF EXISTS Dentista; "
            + "CREATE TABLE Dentista"
            + "("
            + "id INT PRIMARY KEY,"
            + " nome VARCHAR (100) NOT NULL,"
            + "sobrenome VARCHAR (100) NOT NULL,"
            + "matricula VARCHAR (100) NOT NULL"
            + ");";
    private static final String sqlInsert = "INSERT INTO Dentista (id,nome,sobrenome,matricula) VALUES (?,?,?,?);";

    private static final String sqlUpdate = "UPDATE Dentista SET matricula = ? WHERE id = ?;";

    public static void main(String[] args) throws Exception {
        Dentista conta = new Dentista("Eduardo", "Fontes", "23dsfer36", 5);
        Connection connection = null;

        try {
            connection = ConnectionJDBC.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreate);

            PreparedStatement preparedStatementInsert = connection.prepareStatement(sqlInsert);


            preparedStatementInsert.setInt(1, conta.getId());
            preparedStatementInsert.setString(2, conta.getName());
            preparedStatementInsert.setString(3, conta.getSobrenome());
            preparedStatementInsert.setString(4, conta.getMatricula());

            preparedStatementInsert.execute();


            PreparedStatement preparedStatementUpdate = connection.prepareStatement(sqlUpdate);
            preparedStatementUpdate.setString(1, conta.getMatricula());
            preparedStatementUpdate.setInt(2, conta.getId());
            preparedStatementUpdate.execute();


            ShowDentista(connection);

        } catch (Exception e) {
            e.printStackTrace();
            if (connection != null) {
                connection.rollback();
            }

        } finally {
            if (connection != null) {
                connection.close();
            }

        }
    }

    private static void ShowDentista(Connection connection) throws  SQLException {
        String sqlQuery = "SELECT id, matricula, nome, sobrenome FROM Dentista";
        try {

                Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);



        while(resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " - " +
                    resultSet.getString(2) + " - " + resultSet.getString(3) + " - " + resultSet.getString(4));
        }}catch (Exception e){
            e.printStackTrace();
            connection.rollback();
        } finally {
            connection.close();
        }
    }
}



//if(connection == null){
  //      return;
     //   }


//nome:Ewerton Lopes Pereira
//
//Antonio Henrique S Braz
//
//Victor Gomes De Souza Leão
//
//João Sousa
//
//João Victor De Almeida Souza
//
//Juliane Alves De Lima

