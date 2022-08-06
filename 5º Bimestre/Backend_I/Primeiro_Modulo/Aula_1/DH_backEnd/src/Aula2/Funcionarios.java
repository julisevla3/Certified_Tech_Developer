package Aula2;

public abstract class Funcionarios {
    private String nome;
    private String sobrenome;
    private String numeroConta;

    public Funcionarios(String nome, String sobrenome, String numeroConta) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroConta = numeroConta;
    }

    public void pagamentoSalario(){
        double quantia;
        quantia = calcularSaldo();
        imprimirRecibo(quantia);
        depositar(quantia);
    }

    public abstract double calcularSaldo();
    public abstract void imprimirRecibo(double quantia);
    public abstract void depositar(double quantia);

}
