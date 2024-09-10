package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras(){
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itens.add(new Item (nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i: itens){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        itens.removeAll(itensParaRemover);
    }

    public void calcularValorTotal(){
        double valorTotal = 0;
        for(Item i: itens){
            valorTotal = valorTotal + (i.getPreco()*i.getQuantidade());
        }
        System.out.println("Valor total dos itens: R$" + valorTotal);
    }

    public void exibirItens(){
        System.out.println(itens);
    }
    
    public static void main(String[] args) {
        CarrinhoDeCompras compras = new CarrinhoDeCompras();

        compras.adicionarItem("Banana", 5.00, 2);
        compras.adicionarItem("Papel", 5.00, 1);
        compras.adicionarItem("Sabonete", 3.50, 5);
        compras.adicionarItem("Bala", 0.25, 10);
        compras.adicionarItem("Maça", 4.00, 3);
        compras.calcularValorTotal();
        compras.removerItem("Sabonete");
        compras.calcularValorTotal();
        compras.exibirItens();

    }
}
