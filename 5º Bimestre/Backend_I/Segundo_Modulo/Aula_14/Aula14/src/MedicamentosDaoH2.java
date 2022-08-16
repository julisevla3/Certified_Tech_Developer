import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class MedicamentosDaoH2  implements IDao<Medicamento>{

    private ConfiguracaoJDBC configuracaoJDBC;
    final static Logger log = Logger.getLogger(String.valueOf(MedicamentosDaoH2.class));
    public MedicamentosDaoH2(ConfiguracaoJDBC configuracaoJDBC){
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Medicamento salvar(Medicamento medicamento){
        log.debug("Registrando um novo medicamento: "+medicamento.toString());
        Connection connection = configuracaoJDBC.connectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("INSERT INTO medicamentos(nome, laboratorio, quantidade,preco
                values('%s','%s','%s','%s')",

               medicamento.getNome(), medicamento.getLaboratorio(),medicamento.getQuantidade(),medicamento.getPreco();
        try{
            statement = connection.createStatement();
            statement.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if(keys.next()){
                medicamento.setId(keys.getInt(1));
                statement.close();
                connection.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return medicamento;
    }
    public Medicamento buscar (Integer id){
        log.info("Buscando medicamento com id "+id);
        Connection connection = configuracaoJDBC.connectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("SELECT id, nome, laboratorio, quantidade,preco FROM medicamentos where id + "
    }

}
