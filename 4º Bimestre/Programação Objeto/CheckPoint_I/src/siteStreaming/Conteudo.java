package siteStreaming;

public abstract class Conteudo {
    protected String titulo;
    protected String genero;
    protected Integer classificacaoEtaria;
    protected Plano planoAcesso;

    public void alterarPlanoAcesso(Plano plano) {
        this.planoAcesso = planoAcesso;
    }

    public Boolean ehConteudoPermitido(Usuario usuario) {
        if (usuario.getPlano().getTipo().equals("Advance") || this.planoAcesso.getTipo().equals("Free")) {
            return true;
        }

        if (usuario.getPlano().getTipo().equals("Medium") && !this.planoAcesso.getTipo().equals("Advance")) {
            return true;
        }

        if (usuario.getPlano().getTipo().equals("Basic") && (!this.planoAcesso.getTipo().equals("Medium")
            && !this.planoAcesso.getTipo().equals("Advance"))) {
            return true;
        }

        return false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getClassificacaoEtaria() {
        return classificacaoEtaria;
    }

    public Plano getPlanoAcesso() {
        return planoAcesso;
    }
}
