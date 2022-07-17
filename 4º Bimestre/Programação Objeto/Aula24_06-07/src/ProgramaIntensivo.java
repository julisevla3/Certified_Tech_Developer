public class ProgramaIntensivo extends OfertaAcademica{
    private double porcentagemBoni;

    public ProgramaIntensivo(String nome, String descricao, double porcentagemBoni) {
        super(nome, descricao);
        this.porcentagemBoni = porcentagemBoni;
    }
    public double calcularPreco(){
        return 0;
    }

    public void adicionar(OfertaAcademica ofertaAcademica){
        return;
    }
}
