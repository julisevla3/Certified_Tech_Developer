import java.time.LocalDate;
import java.util.Date;

public class Paciente {
    String nome;
    String sobrenome;
    String historiaClinica;
    LocalDate dataInternacao;
    LocalDate dataAlta;


    Paciente(String nome, String sobrenome, String historiaClinica, LocalDate dataInternacao) throws DataException
    {       LocalDate hoje= LocalDate.now();
        this.nome=nome;
        this.sobrenome=sobrenome;
        dataAlta=null;
        if (dataInternacao.isBefore(hoje))
            this.dataInternacao=dataInternacao;
        else {
            throw new DataException("data da internacao antes da data atual");
        }
    }

    public LocalDate getDataInternacao() {
        return dataInternacao;
    }

    public LocalDate getDataAlta() {
        return dataAlta;
    }

    public void darAlta(LocalDate dataAlta) throws DataException
    {
        if(dataAlta.isAfter(dataInternacao))
            System.out.println("Ok");
        else
            System.out.println("Não pode");
            throw new DataException("Data da alta anterior a data da internacao");
    }

}
