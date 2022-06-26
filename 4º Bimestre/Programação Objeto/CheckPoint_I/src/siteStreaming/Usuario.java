package siteStreaming;

public class Usuario {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private Plano plano;

    private Usuario(
            String nome,
            String cpf,
            String endereco,
            String telefone,
            Plano plano)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.plano = plano;
    }

    public static Usuario cadastrarUsuario(
            String nome,
            String cpf,
            String endereco,
            String telefone,
            Plano plano)
    {
        return new Usuario(nome, cpf, endereco, telefone, plano);
    }

    public void alterarPlano(Plano plano) {
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public Plano getPlano() {
        return plano;
    }
}
