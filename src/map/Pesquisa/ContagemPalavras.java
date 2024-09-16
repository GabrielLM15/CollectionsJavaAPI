package map.Pesquisa;
import java.util.Map;
import java.util.HashMap;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras(){
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String nome, Integer contagem){
        contagemPalavrasMap.put(nome, contagem);
    }

    public void removerPalavra(String palavra){
        if(!contagemPalavrasMap.isEmpty()){
            contagemPalavrasMap.remove(palavra);
        } else {
            System.out.println("Lista Vazia");
        }
    }

    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        for (int contagem : contagemPalavrasMap.values()) {
            contagemTotal += contagem;
          }
          return contagemTotal;
        }

        public String encontrarPalavrasMaisFrequente() {
            String linguagemMaisFrequente = null;
            int maiorContagem = 0;
            for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
              if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
              }
            }
            return linguagemMaisFrequente;
          }


    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("teste", 3);
        contagemPalavras.adicionarPalavra("agua", 5);
        contagemPalavras.adicionarPalavra("Java", 10);
        contagemPalavras.adicionarPalavra("gabriel", 1);

        System.out.println(contagemPalavras.exibirContagemPalavras());

        System.out.println(contagemPalavras.encontrarPalavrasMaisFrequente());
    }


}
