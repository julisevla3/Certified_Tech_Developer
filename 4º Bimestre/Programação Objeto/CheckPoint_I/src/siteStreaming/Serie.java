package siteStreaming;

import java.util.List;

public class Serie extends Conteudo {
    private Integer qtdTemporadas;
    private List<Episodio> episodios;

    public Serie(String titulo,
                 String genero,
                 Integer classificacaoEtaria,
                 Plano planoAcesso,
                 Integer qtdTemporadas,
                 List<Episodio> episodios)
    {
        this.titulo = titulo;
        this.genero = genero;
        this.classificacaoEtaria = classificacaoEtaria;
        this.planoAcesso = planoAcesso;
        this.qtdTemporadas = qtdTemporadas;
        this.episodios = episodios;
    }

    public static Conteudo cadastrarSerie(
            String titulo,
            String genero,
            Integer classificacaoEtaria,
            Plano planoAcesso,
            Integer qtdTemporadas,
            List<Episodio> episodios)
    {
        return new Serie(
                titulo,
                genero,
                classificacaoEtaria,
                planoAcesso,
                qtdTemporadas,
                episodios);
    }

    public Integer getQtdTemporadas() {
        return qtdTemporadas;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }
}
