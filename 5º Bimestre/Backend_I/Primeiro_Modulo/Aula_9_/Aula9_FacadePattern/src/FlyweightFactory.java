import java.util.HashMap;

public class FlyweightFactory {

    public static final HashMap<String, Triangulo> trianguloMap = new HashMap<>();

public static Triangulo obterTriangulo(String cor){   Triangulo triangulo = trianguloMap.get.(cor)
}
}



