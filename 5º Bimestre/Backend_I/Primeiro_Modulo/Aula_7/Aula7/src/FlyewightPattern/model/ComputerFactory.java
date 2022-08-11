package FlyewightPattern.model;

import java.util.HashMap;
import java.util.Map;

public class ComputerFactory {
    private static Map<String, Computer> macFlyweight = new HashMap<>();


    public Computer getComputer(int ram, int disco) {
        String id = "id " + ram + " : " + disco;
        System.out.println(id);

        //negando a saida, se não..

        if (!macFlyweight.containsKey(id)) {
            macFlyweight.put(id, new Computer(ram, disco));
            System.out.println("\nPC Criado com sucesso ");
            return macFlyweight.get(id);
        }
            System.out.println("\n PC obtido");
            return macFlyweight.get(id);
        }
}



