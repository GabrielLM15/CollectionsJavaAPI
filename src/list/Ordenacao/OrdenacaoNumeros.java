package list.Ordenacao;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoNumeros{
    private List<Integer> ordenacaoNumeros;

    public OrdenacaoNumeros(){
        this.ordenacaoNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        ordenacaoNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendentes = new ArrayList<>(ordenacaoNumeros);
        if(!ordenacaoNumeros.isEmpty()){
            Collections.sort(numerosAscendentes);
            return numerosAscendentes;
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendentes = new ArrayList<>(ordenacaoNumeros);
        if(!ordenacaoNumeros.isEmpty()){
            numerosDescendentes.sort(Collections.reverseOrder());
            return numerosDescendentes;
        } else{
            throw new RuntimeException("A lista esta vazia!");
        }
     }

     public void exibirNumeros(){
        if(!ordenacaoNumeros.isEmpty()){
            System.out.println(this.ordenacaoNumeros);
        } else{
            System.out.println("A lista esta vazia!");
        }
     }

     public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        numeros.exibirNumeros();

        System.out.println(numeros.ordenarAscendente());

        System.out.println(numeros.ordenarDescendente());

        numeros.exibirNumeros();
     }
}
