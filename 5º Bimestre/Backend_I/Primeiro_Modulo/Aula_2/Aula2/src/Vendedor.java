//validação que usa propriedades subclasse apenas
// Classe abstrata Vendedor - aqui vai o Template Method

public class Vendedor {
    // permite que a propria classe e as subclasse que fazem herança com ela possam assim fazer manilulação dos atributos
    protected String nome;
    protected int vendas = 0;
    protected int pontos_por_vendas;




    public void vender(int qntVendas) {
        this.vendas += qntVendas;
        System.out.println(this.nome+ " reslizou " +qntVendas);
    }

    public Vendedor(int pontosObtidos) {
        this.pontosObtidos = pontosObtidos;
    }

    public
}
