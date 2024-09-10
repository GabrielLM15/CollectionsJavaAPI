package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numero;

    public SomaNumeros(){
        this.numero = new ArrayList<>();
    }
    public void adicionarNumero(int num){
        numero.add(num);
    }

    public int calcularSoma(){
        int soma = 0;
        if(!numero.isEmpty()){
            for(int n : numero){
                soma = soma + n;
            }
        }
        return soma;
    }

    public int encontrarMenorNumero(){
        int menorNumero = 0;
        if(!numero.isEmpty()){
            for(int n : numero){
                if(menorNumero == 0){
                    menorNumero = n;
                } else if(n < menorNumero){
                    menorNumero = n;
                }
            }
        }
        return menorNumero;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        if(!numero.isEmpty()){
            for(int n : numero){
                if(n > maiorNumero){
                    maiorNumero = n;
                }
            }
        }
        return maiorNumero;
    }


        /*public int encontrarMaiorNumero() {
            int maiorNumero = Integer.MIN_VALUE; MAX_VALUE
            if (!numeros.isEmpty()) {
              for (Integer numero : numeros) {
                if (numero >= maiorNumero) {
                  maiorNumero = numero;
                }
              }
              return maiorNumero;
            } else {
              throw new RuntimeException("A lista está vazia!");
            }
          }*/

    public void exibirNumeros(){
        System.out.println(this.numero);
    }

    public static void main(String[] args) {
        SomaNumeros listaNumeros = new SomaNumeros();

        listaNumeros.adicionarNumero(20);
        listaNumeros.adicionarNumero(30);
        listaNumeros.adicionarNumero(40);
        listaNumeros.adicionarNumero(60);
        listaNumeros.adicionarNumero(100);

        System.out.println(listaNumeros.calcularSoma());
        System.out.println("Maior numero: " + listaNumeros.encontrarMaiorNumero());
        System.out.println("Menor numero: " + listaNumeros.encontrarMenorNumero());
        listaNumeros.exibirNumeros();
    }
}
