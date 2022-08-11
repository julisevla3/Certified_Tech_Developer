public class Arvore {
    private String cor;
    private String tipoArvore;
    private int altura;
    private int largura;

    public Arvore(String cor, String tipoArvore, int altura, int largura) {
        this.cor = cor;
        this.tipoArvore = tipoArvore;
        this.altura = altura;
        this.largura = largura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoArvore() {
        return tipoArvore;
    }

    public void setTipoArvore(String tipoArvore) {
        this.tipoArvore = tipoArvore;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    @Override
    public String toString() {
        return "Arvore{" +
                "cor='" + cor + '\'' +
                ", tipoArvore='" + tipoArvore + '\'' +
                ", altura=" + altura +
                ", largura=" + largura +
                '}';
    }
}
