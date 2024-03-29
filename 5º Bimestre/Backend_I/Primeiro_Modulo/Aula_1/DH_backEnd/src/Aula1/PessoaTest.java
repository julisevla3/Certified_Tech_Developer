package Aula1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PessoaTest {

    Pessoa p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
    List<String> colecao = new ArrayList<String>();

    @BeforeEach
    void doBefore(){
        p1 = new Pessoa("Ivo", "Ganda");
        p1.setIdade(LocalDate.of(2016,3,23));

        p2 = new Pessoa("Ana", "Musk");
        p2.setIdade(LocalDate.of(1966,3,23));

        p3 = new Pessoa("Joe", "Sacadas");
        p3.setIdade(LocalDate.of(2010,3,23));

        p4 = new Pessoa("Rob", "Velom");
        p4.setIdade(LocalDate.of(1976,3,23));

        p5 = new Pessoa("Ted", "Murfie");
        p5.setIdade(LocalDate.of(2014,4,10));

        p6 = new Pessoa("Roberto", "Silva");
        p6.setIdade(LocalDate.of(2000,12,20));

        p7 = new Pessoa("Renata", "Oliveira");
        p7.setIdade(LocalDate.of(2010,8,23));

        p8 = new Pessoa("Murilo", "Lima");
        p8.setIdade(LocalDate.of(2015,9,22));

        p9 = new Pessoa("Candido", "Fabio");
        p9.setIdade(LocalDate.of(1975,9,12));

        p10 = new Pessoa("Camila", "Pitanga");
        p10.setIdade(LocalDate.of(2014,5,25));
    }



    @Test
    void imprimirObjetos(){
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());
        System.out.println(p7.toString());
        System.out.println(p8.toString());
        System.out.println(p9.toString());
        System.out.println(p10.toString());

    }

    @Test
    void adicionarColecao(){
        p1.adicionarNomes(p1);
        p2.adicionarNomes(p1);
        p3.adicionarNomes(p1);
        p4.adicionarNomes(p1);
        p5.adicionarNomes(p1);
        p6.adicionarNomes(p1);
        p7.adicionarNomes(p1);
        p8.adicionarNomes(p1);
        p9.adicionarNomes(p1);
        p10.adicionarNomes(p1);




    }

}
