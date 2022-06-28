public class Caixa  extends Produto{

    private Double comprimento;
    private Double altura;
    private Double largura;

    public Caixa (Double comprimento, Double altura, Double largura, Double peso){
        super( peso);

        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;

    }


    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    @Override
    public Double calcularEspaco() {
        return getAltura() * getComprimento() * getLargura();
    }
}
