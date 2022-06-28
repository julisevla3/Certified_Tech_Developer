import java.util.ArrayList;
import java.util.List;

public class Armazem {
    public Armazem() {
        this.produtos = new ArrayList();
    }

    List<Produto> produtos;

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double calcularEspacoNecessario() {
        double espacoNecessario = 0;

        for(Produto produto: produtos){
            espacoNecessario += produto.calcularEspaco();
        }
        return espacoNecessario;
    }

}