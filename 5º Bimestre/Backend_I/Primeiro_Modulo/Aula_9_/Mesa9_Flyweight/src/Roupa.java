public class Roupa {
    private String tamanho, tipo;
    private Boolean eNovo;
    private Boolean importada;

    public Roupa(String tamanho, String tipo, Boolean eNovo, Boolean importada) {
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.eNovo = eNovo;
        this.importada = importada;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean geteNovo() {
        return eNovo;
    }

    public void seteNovo(Boolean eNovo) {
        this.eNovo = eNovo;
    }

    public Boolean getImportada() {
        return importada;
    }

    public void setImportada(Boolean importada) {
        this.importada = importada;
    }

    @Override
    public String toString() {
        return "Roupa{" +
                "tamanho='" + tamanho + '\'' +
                ", tipo='" + tipo + '\'' +
                ", eNovo=" + eNovo +
                ", importada=" + importada +
                '}';
    }
}
