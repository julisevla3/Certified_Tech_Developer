public class Main {
    public static void main(String args[] ) {

        FacadeDesconto facadeDesconto = new FacadeDesconto();

        Cartao cartao = new Cartao("123123123123123", "Start Bank");
        Produto produto = new Produto("ervilhas", "lata");

        System.out.println("\nDesconto: "+ facadeDesconto.desconto(cartao,produto,1));
    }
}