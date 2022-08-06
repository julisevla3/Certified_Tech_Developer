package Aula5_ProxyPattern;

import org.testng.annotations.Test;

import java.util.Date;

public class PessoaTest {
    Date data = new Date();

    @Test
    public  void vacinar1(){
        Pessoa p1 = new Pessoa("Juli", "Alves", "321321321321",data, "Pfizer");
        Vacinar vacinar = new ServicoVacinar();
        vacinar.vacinarPessoa(p1.getRg(), p1.getDataVacina(), p1.getNomeVacina());
        System.out.println(p1.toString());
    }
}
