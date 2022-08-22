import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



       List<Contatos> contatos =  new ArrayList<>();

       Contatos contato1 = new Contatos("fernando@gmail.com","98956-6548");
        Contatos contato2 = new Contatos("maria@gmail.com","98520-6488");
        contatos.add(contato1);
        contatos.add(contato2);


        //Salvando paginas em um arquivo
        FileOutputStream fo = null;
        try {
            fo = new FileOutputStream("contatos.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fo);
            objectOutputStream.writeObject(contatos);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<Contatos>contatos2 = null;
        FileInputStream fi = null;

        try{
            fi = new FileInputStream("contatos.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for(
                Contatos c : contatos){
            System.out.println(c.getEmail()+ " : " +c.getTelefone() );
        }
    }
}


