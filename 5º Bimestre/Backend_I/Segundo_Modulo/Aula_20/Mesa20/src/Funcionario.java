import java.io.Serializable;

public class Funcionario implements Serializable {
    private String nome, sobrenome, rg;
    private Double salario;

    public Funcionario(String nome, String sobrenome, String rg, Double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", rg='" + rg + '\'' +
                ", salario=" + salario +
                '}';
    }
}
