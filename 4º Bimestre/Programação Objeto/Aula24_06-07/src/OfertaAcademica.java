public abstract class OfertaAcademica {

    private String nome;
    private  String descricao;

    public OfertaAcademica(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;

    }

    public abstract double calcularPreco();


    }


