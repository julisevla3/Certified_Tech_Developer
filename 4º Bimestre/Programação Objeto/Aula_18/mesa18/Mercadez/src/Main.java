public class Main {
    public static void main(String[] args) {

  Armazem armazem = new Armazem();

  ProdutoFactory produtoFactory = ProdutoFactory.getInstance();
  Produto caixa = produtoFactory.criarProduto("CAIXA10X10");
  Produto futebol = produtoFactory.criarProduto("FUTEBOL");
  Produto bolaTenis = produtoFactory.criarProduto("BOLATENIS");

  armazem.getProdutos().add(caixa);
  armazem.getProdutos().add(futebol);
  armazem.getProdutos().add(bolaTenis);

  double tamanhoArmazem = armazem.calcularEspacoNecessario();



        System.out.println(tamanhoArmazem);
    }
}