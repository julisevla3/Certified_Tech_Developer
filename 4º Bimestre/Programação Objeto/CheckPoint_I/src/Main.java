import siteStreaming.*;

public class Main {
    public static void main(String[] args) {
        Plano planoBasic = Plano.cadastrarPlano(
                "Basic",
                19.90,
                1);
        Plano planoMedium = Plano.cadastrarPlano(
                "Medium",
                29.90,
                2);
        Plano planoAdvance = Plano.cadastrarPlano(
                "Advance",
                39.90,
                4);

        Usuario juliane = Usuario.cadastrarUsuario(
                "Juliane",
                "123123",
                "Rua X",
                "1234-5678",
                planoBasic);


        Conteudo filmeAdvance = Filme.cadastrarFilme(
                "filme advance",
                "Romance",
                16,
                planoAdvance,
                120);

        Conteudo filmeBasic = Filme.cadastrarFilme(
                "filme basic",
                "Romance",
                16,
                planoBasic,
                160);

        System.out.println("Conteudo " + filmeAdvance.getTitulo() + " eh permitido para usuario "
                + juliane.getNome() + "? " + filmeAdvance.ehConteudoPermitido(juliane));

        System.out.println("Conteudo " + filmeBasic.getTitulo() + " eh permitido para usuario "
                + juliane.getNome() + "? " +filmeBasic.ehConteudoPermitido(juliane));
    }
}