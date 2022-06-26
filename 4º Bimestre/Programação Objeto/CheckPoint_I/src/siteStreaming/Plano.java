package siteStreaming;

public class Plano {
    private String tipo;
    private Double valor;
    private Integer qtdTelas;

    private Plano(
            String tipo,
            Double valor,
            Integer qtdTelas)
    {
        this.tipo = tipo;
        this.valor = valor;
        this.qtdTelas = qtdTelas;
    }

    public static Plano cadastrarPlano(
            String tipo,
            Double valor,
            Integer qtdTelas)
    {
        return new Plano(
                tipo,
                valor,
                qtdTelas);
    }

    public void reajustarValor(Double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getValor() {
        return valor;
    }

    public Integer getQtdTelas() {
        return qtdTelas;
    }
}
