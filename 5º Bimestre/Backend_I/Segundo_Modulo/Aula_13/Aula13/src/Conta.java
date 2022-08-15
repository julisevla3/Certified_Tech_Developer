public class Conta {
    private String nome;
    private int id;
    private String numeroConta;
    private double saldo;

    public Conta(String nome, int id, String numeroConta, double saldo) {
        this.nome = nome;
        this.id = id;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double aumentarSaldo(double valor){
        this.saldo += valor;
        return this.saldo;
    }
}
