import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilialServiceTest {

    FilialService filialService;

    @BeforeEach
    void doBefore(){

        filialService = new FilialService(new FilialDaoH2(new ConfiguracaoJDBC()));
    }

    @Test
    public void salvarFilial(){
        Filial filial1 = new Filial("Delux","Rua 25 de marco","300", "São Paulo", "São Paulo",1);
        FilialService.salvar(filial1);
        assertTrue(filial1.getId()!=null);


    }

}