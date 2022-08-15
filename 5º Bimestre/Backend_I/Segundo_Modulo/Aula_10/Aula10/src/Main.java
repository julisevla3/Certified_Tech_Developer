import org.apache.log4j.BasicConfigurator;

import java.util.logging.Logger;

public class Main {


        private static final Logger logger = Logger.getLogger(String.valueOf(Main.class));

        public static void main(String[] args) throws Exception {
            //Alternativa para configurar o log4j.properties

            BasicConfigurator.configure();

            Leao leao = new Leao("Simba", 8,true);
            leao.correr();
            leao.eMaiorQue10();


            try{
                leao.eMaiorQue10();
            }
            catch (Exception e){
                logger.info("A idade do leão "+leao.getNome()+"está incorreta",e);
            }
    }
}