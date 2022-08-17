public class Paciente {
    private String nome;
    private String sobrenome;
    private String RG;
    private String data_de_cadastro;
    private Endereco endereco;

    public Paciente(String nome, String sobrenome, String RG, String data_de_cadastro, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.RG = RG;
        this.data_de_cadastro = data_de_cadastro;
        this.endereco = endereco;
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

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getData_de_cadastro() {
        return data_de_cadastro;
    }

    public void setData_de_cadastro(String data_de_cadastro) {
        this.data_de_cadastro = data_de_cadastro;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
