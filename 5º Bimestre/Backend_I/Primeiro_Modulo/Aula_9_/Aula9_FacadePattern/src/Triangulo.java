public class Triangulo {
    private String cor;
    private Integer tamanho;

    public Triangulo(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Triangulo{" +
                "cor='" + cor + '\'' +
                '}';
    }
}
