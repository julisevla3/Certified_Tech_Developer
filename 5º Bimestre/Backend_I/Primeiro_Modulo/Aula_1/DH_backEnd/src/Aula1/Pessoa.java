package Aula1;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String sobrenome;
    LocalDate idade;
    List<String> colecao = new ArrayList<String>();

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getColecao() {
        return colecao;
    }

    public void setColecao(List<String> colecao) {
        this.colecao = colecao;
    }

    public List<String> adicionarNomes(Pessoa p){
        //Pega o nome e conta os caracteres e joga para o var
        int var = p.getNome().length();
        int idade = p.Idade();
        if(var>= 5 && idade>=18){
            colecao.add(p.getNome());
            System.out.println(colecao);


        }
        return null;
    }


    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    public int Idade() {
       int idade = Period.between(this.idade, LocalDate.of(2022,8,1)).getYears();
       return idade;

    }


    //metodo sobrescrito, polimorfismo
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                '}';
    }
}

