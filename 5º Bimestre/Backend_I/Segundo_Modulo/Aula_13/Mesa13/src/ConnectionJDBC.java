import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Collection;

public class ConnectionJDBC {

    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver");
        //Para fazer a conceção com o banco de dados H
        return DriverManager.getConnection("jdbc:h2:~/test", "sa","");
    }
}
