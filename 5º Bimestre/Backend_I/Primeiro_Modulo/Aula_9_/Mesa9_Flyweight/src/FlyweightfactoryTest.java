import org.junit.jupiter.api.Test;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.AssertJUnit.assertEquals;

public class FlyweightFactoryTest {

        @Test
        void getRoupaComTamanho(){
            Roupa roupa = FlyweightFactory.obterRoupa("M");
            roupa.setTamanho(2);
            Roupa roupa1 = FlyweightFactory.obterRoupa("M");
            roupa1.setTamanho(4);

            assertEquals(roupa.getCor(),"M");
            assertEquals(roupa1.getTamanho(),4);
            assertEquals(FlyweightFactory.roupaMap.size()==1,true);


        }
    }
}
