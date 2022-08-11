public class Main {
    //Instrução para pegar a tebela usuario, caso já exista, criar uma nova tabela

    private static final String sqlCresteTable = "DROP TABLE IF EXISTS Usuario; CREATE TABLE Usuario"
            +"("
            +"id INT PRIMARY KEY,"
            + "Primeiro_Nome carchar(100) NOT NULL,"
            + "Sobrenome carchar(100) NOT NULL,"
            + "Idade INT NOT NULL"
            +")";

    //iNSTRUÇÃO PARA INSERIR DADOS NA TABELA USUARIO
    private static final  String sqlInsert1 = "INSERT INTO Usuario(id,Primeiro_Nome,Sobrenome,Idade)"+
            "Values (1,'Maria', 'Almeida', 50",

    //Instrução para excluir um registro na Tabela Usuario

    pri



}


