public class Curso extends OfertaAcademica{
    private double cargaHorario;
    private double duracao;
    private double valorHora;



    public Curso(String nome, String descricao, double cargaHorario, double duracao, double valorHora) {
        super(nome, descricao);
        this.cargaHorario = cargaHorario;
        this.duracao = duracao;
        this.valorHora = valorHora;

    }

}
