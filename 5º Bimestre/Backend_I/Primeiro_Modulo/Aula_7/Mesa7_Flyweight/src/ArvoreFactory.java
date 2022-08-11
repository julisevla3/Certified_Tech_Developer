import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class ArvoreFactory {
    private static final HashMap<String, Arvore> arvoreMap = new HashMap();

    public static Arvore getArvore (String tipoArvore){
        Arvore arvore = (Arvore) arvoreMap.get(tipoArvore);

        if (arvore == null) {
            arvore = new Arvore(tipoArvore);

        }
    }
    private static Arvore criaArvore(String tipoArvore){
        switch (tipoArvore){
            case "Ornamental":
                return new Arvore("verde", "Ornamental", 200, 400);

            case "Frutifera":
                return new Arvore("vermelho", "Frutifera", 500, 300);
            case "Florifera":
                return new Arvore("azul", "Florifera", 100, 200);+
            default:
                return null;
        }
    }
}
