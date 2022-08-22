import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cachorro> cachorros = new ArrayList<>();

        Cachorro cachorro1 = new Cachorro(3, "Pluto");

        Cachorro cachorro2 = new Cachorro(1, "Snoop");

        cachorros.add(cachorro1);
        cachorros.add(cachorro2);


        //Salvamos toda a coleção de paginas em um arquivo
        FileOutputStream fo = null;
        try {
            fo = new FileOutputStream("OutPutFile.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fo);
            objectOutputStream.writeObject(cachorros);

        } catch (FileNotFoundException e) {
            System.out.println("Message de erro1");
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Refuperamos toda a coleção com cada uma das paginas do arquivo
        List<Cachorro> cachorros2 = null;
        FileInputStream fi = null;


        try {
            fi = new FileInputStream("OutPutFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            cachorros2 = (ArrayList) ois.readObject();
        } catch (
                FileNotFoundException e) {
            System.out.println("Message de erro2");
            throw new RuntimeException(e);
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        } catch (
                ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (
                Cachorro cachorro : cachorros2) {
            System.out.println(cachorro.getNome()+ " : " + cachorro.getIdade());
        }
    }
}