public class Bola extends Produto{
    private Double raio;

    public Bola (Double raio, Double peso){
        super (peso);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double calcularEspaco() {
        return  Math.pow(getRaio(),2)*3.14;
    }
}
