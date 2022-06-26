package siteStreaming;

public class Filme extends Conteudo {
    private Integer duracao;

    private Filme(String titulo, String genero, Integer classificacaoEtaria,
                 Plano planoAcesso, Integer duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.classificacaoEtaria = classificacaoEtaria;
        this.planoAcesso = planoAcesso;
        this.duracao = duracao;
    }

    public static Conteudo cadastrarFilme(
            String titulo,
            String genero,
            Integer classificacaoEtaria,
            Plano planoAcesso,
            Integer duracao)
    {
        return new Filme(
                titulo,
                genero,
                classificacaoEtaria,
                planoAcesso,
                duracao);
    }

    public Integer getDuracao() {
        return duracao;
    }
}
