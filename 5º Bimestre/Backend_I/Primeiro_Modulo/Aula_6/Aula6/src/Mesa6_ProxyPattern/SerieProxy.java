package Mesa6_ProxyPattern;

public class SerieProxy {
    private int qtdViews;

    public SerieProxy() {
        this.qtdViews = 0;
    }

    public String pedeSerie( String nome) throws SerieNaoHabilitadaException{
        if(this.qtdViews >4){
            throw new SerieNaoHabilitadaException("Excede o número de reproduções permitidas");

        }
        this.qtdViews++;
        Serie serie = new Serie();

        return serie.getSerie (nome);

    }




}
