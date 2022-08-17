import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    //Criando Logger
    private static final Logger logger = Logger.getLogger(Lista.class);
    private  List<Integer> listaInteiros;

    public Lista() {
        this.listaInteiros = new ArrayList();
    }

    public void adiconaLista (Integer numero){
        this.listaInteiros.add(numero);
        if(this.listaInteiros.size()>5 && this.listaInteiros.size()<=10){
            logger.info("O comprimento e maior que 5");
        }else if (this.listaInteiros.size()>10){
            logger.info("O comprimento e maior que 10");
                    }
            }

    public void calcularMedia(){
        if(listaInteiros.size() == 0){
            logger.error("A lista e igual a zero");
            return;
        }
        Integer somaTotal = 0;
        for(Integer number:listaInteiros){
            somaTotal = somaTotal + number;

        }

        Double media = Double.valueOf(somaTotal/this.listaInteiros.size());

        logger.info("A media e "+media);
    }
}
