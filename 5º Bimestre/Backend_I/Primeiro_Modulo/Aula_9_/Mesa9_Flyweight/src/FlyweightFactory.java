
import java.util.HashMap;
    public class FlyweightFactory {

        public static final HashMap<String,Roupa> roupaMap = new HashMap<>();

        public static Roupa obterRoupa(String cor){
            Roupa triangulo = roupaMap.get(cor);

            if(roupa == null){
                roupa = new Roupa(tamanho);
                roupaMap.put(cor,triangulo);
            }
            return roupa;
        }
    }
}
