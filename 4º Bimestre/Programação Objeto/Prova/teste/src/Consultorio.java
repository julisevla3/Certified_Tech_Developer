import java.util.List;

public class Consultorio {
    private String nome;
    private List<Consulta> consulta;

    public Consultorio(String nome, List<Consulta> consulta) {
        this.nome = nome;
        this.consulta = consulta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Consulta> getConsulta() {
        return consulta;
    }

    public void setConsulta(List<Consulta> consulta) {
        this.consulta = consulta;
    }
}
