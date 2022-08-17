import org.apache.log4j.BasicConfigurator;

public class Main {
    public static void main(String[] args) {
       BasicConfigurator.configure();



       Lista lista = new Lista();
       lista.calcularMedia();
       lista.adiconaLista(1);
       lista.adiconaLista(1);
       lista.adiconaLista(1);
       lista.adiconaLista(1);
       lista.adiconaLista(1);
       lista.adiconaLista(1);
       lista.adiconaLista(1);
       lista.adiconaLista(1);
       lista.adiconaLista(1);
       lista.adiconaLista(1);
       lista.adiconaLista(1);
       lista.adiconaLista(1);

       lista.calcularMedia();



    }
}