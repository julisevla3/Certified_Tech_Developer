package siteStreaming;

public class Episodio {
    private String titulo;
    private Integer temporada;
    private Integer duracao;

    private Episodio(
            String titulo,
            Integer temporada,
            Integer duracao) {
        this.titulo = titulo;
        this.temporada = temporada;
        this.duracao = duracao;
    }

    public static Episodio cadastrarEpisodio(
            String titulo,
            Integer temporada,
            Integer duracao)
    {
        return new Episodio(titulo, temporada, duracao);
    }
}
