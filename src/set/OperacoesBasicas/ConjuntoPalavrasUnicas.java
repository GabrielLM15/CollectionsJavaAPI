package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas(){
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(palavrasUnicas.contains(palavra)) {
            palavrasUnicas.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada");
            }
        }

    public void verificarPalavra(String palavra){
        if(!palavra.isEmpty()){
            if(palavrasUnicas.contains(palavra)){
                System.out.println("A palavra " + palavra + " está presente no conjunto");
            } else {
                System.out.println("A palavra " + palavra + " não está presente no conjunto");
            }
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicas);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Python");
        conjuntoPalavrasUnicas.adicionarPalavra("Python");
        conjuntoPalavrasUnicas.adicionarPalavra("Java");
        conjuntoPalavrasUnicas.adicionarPalavra("C++");
        conjuntoPalavrasUnicas.adicionarPalavra("Ruby");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Python");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("javaScript");

        conjuntoPalavrasUnicas.verificarPalavra("Java");
    }
}
