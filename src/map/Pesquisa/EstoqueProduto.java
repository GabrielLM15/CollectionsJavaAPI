package map.Pesquisa;
import java.util.Map;
import java.util.HashMap;

public class EstoqueProduto {
    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProduto(){
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, int quantidade, double preco){
        estoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        if(!estoqueProdutoMap.isEmpty()){
            System.out.println(estoqueProdutoMap);
        } else{
            System.out.println("Lista vazia");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        if(!estoqueProdutoMap.isEmpty()){
            for(Produto p : estoqueProdutoMap.values()){
                valorTotal += p.getQuantidade()*p.getPreco();
            }
        } else{
            System.out.println("Lista vazia");
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutoMap.isEmpty()){
            for(Produto p : estoqueProdutoMap.values()){
                if(p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }

            }
        } else{
            System.out.println("Lista Vazia");
        }
        return produtoMaisCaro;
    }
}
