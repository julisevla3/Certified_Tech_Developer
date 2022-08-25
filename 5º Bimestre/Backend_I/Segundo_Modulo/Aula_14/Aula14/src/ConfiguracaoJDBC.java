import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfiguracaoJDBC {
    private String jdbcDriver;
    private String dbUrl;
    private String user;
    private String key;

    public ConfiguracaoJDBC(String jdbcDriver, String dbUrl, String user, String key) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.user = user;
        this.key = key;
    }
    public ConfiguracaoJDBC() {
        this.jdbcDriver = "org.h2.Driver";
        this.dbUrl = "jdbc:h2:mem:medicamentos2;";
        this.user = "sa";
        this.key = "";
    }
public Connection connectarComBancoDeDados(){
      Connection connection = null;
      try {
          connection = DriverManager.getConnection(dbUrl,user,key);
      }
      catch (SQLException throwables){
          throwables.printStackTrace();
      }
      return connection;
}

}
