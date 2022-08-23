import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Empresa contato1 = new Empresa("321654645654654", "Juliane Alves LTDA");

        Funcionario funcionario1 = new Funcionario("Juliane", "Alves", "123456", 5000d);
        Funcionario funcionario2 = new Funcionario("Fernando", "Pereira", "8852741", 2000d);
        Funcionario funcionario3 = new Funcionario("Aldo", "Oliveira", "6549878", 10000d);
        Funcionario funcionario4 = new Funcionario("Carlos", "Silva", "987654", 8000d);


        contato1.adicionaFuncionario(funcionario1);
        contato1.adicionaFuncionario(funcionario2);
        contato1.adicionaFuncionario(funcionario3);
        contato1.adicionaFuncionario(funcionario4);

        //Salvando paginas em um arquivo
        FileOutputStream fo = null;
        try {
            fo = new FileOutputStream("Empresa.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fo);
            objectOutputStream.writeObject(contato1);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Empresa empresa = null;
        FileInputStream fi = null;

        try {
            fi = new FileInputStream("Empresa.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            empresa = (Empresa) ois.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (
                Funcionario funcionario : empresa.getFuncionarios()) {
            System.out.println(funcionario.getNome() + " : " + funcionario.getSobrenome() + " : " + funcionario.getRg() + " : " + funcionario.getSalario());
        }
    }
}

