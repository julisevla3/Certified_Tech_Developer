public abstract class Produto {

 private Double peso;

    public Produto(Double peso) {
        this.peso = peso;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }


public abstract Double calcularEspaco();


}
