package Aula6_Integrador;

public class GradeDeFilmes implements IGradeDeFilmes {

    @Override
    public Filme getFilme(String nomeDoFilme) throws FilmeNaoHabilitadoException {
        Filme f = null;
        switch (nomeDoFilme) {
            case "The Whiter Tiger":
                f = new Filme("The White Tiger", "ARG", "WWW.wtiger.com");
                break;
            case f = new Filme("His Houses", "BRA", "WWW.wtiger.com");
                break;
        }
    }
}
