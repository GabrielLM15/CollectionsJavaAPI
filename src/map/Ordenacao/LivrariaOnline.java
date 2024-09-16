package map.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.List;

public class LivrariaOnline {
    private Map<String, Livro> livrariaMap;
    
    public LivrariaOnline(){
        this.livrariaMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livrariaMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        if(!livrariaMap.isEmpty()){
            for(Map.Entry<String, Livro> entry : livrariaMap.entrySet()){
                if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                    livrariaMap.remove(titulo);
                }
            }
        }

    }

    public Map<String, Livro> exibirLivrosPorPreco(){
        List<Map.Entry<String, Livro>> livroParaOrdenarPorPreco = new ArrayList<>(livrariaMap.entrySet());

        Collections.sort(livroParaOrdenarPorPreco, new ComparatorPorPreco());

        Map<String, Livro> livrosPorPreco = new LinkedHashMap<>();

        for(Map.Entry<String, Livro> entry : livroParaOrdenarPorPreco){
            livrosPorPreco.put(entry.getKey(), entry.getValue());
        }

        return livrosPorPreco;
    }

    public Map<String, Livro> exibirPorAutor(){
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livrariaMap.entrySet());

        Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());

        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();

        for(Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor){
            livrosPorAutor.put(entry.getKey(), entry.getValue());
        }

        return livrosPorAutor;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
    Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
    for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
      Livro livro = entry.getValue();
      if (livro.getAutor().equals(autor)) {
        livrosPorAutor.put(entry.getKey(), livro);
      }
    }
    return livrosPorAutor;
  }

  public List<Livro> obterLivroMaisCaro() {
    List<Livro> livrosMaisCaros = new ArrayList<>();
    double precoMaisAlto = Double.MIN_VALUE;

    if (!livrariaMap.isEmpty()) {
      for (Livro livro : livrariaMap.values()) {
        if (livro.getPreco() > precoMaisAlto) {
          precoMaisAlto = livro.getPreco();
        }
      }
    } else {
      throw new NoSuchElementException("A livraria está vazia!");
    }

    for(Map.Entry<String, Livro> entry: livrariaMap.entrySet()) {
      if(entry.getValue().getPreco() == precoMaisAlto) {
        Livro livroComPrecoMaisAlto = livrariaMap.get(entry.getKey());
        livrosMaisCaros.add(livroComPrecoMaisAlto);
      }
    }
    return livrosMaisCaros;
  }

  public List<Livro> obterLivroMaisBarato() {
    List<Livro> livrosMaisBaratos = new ArrayList<>();
    double precoMaisBaixo = Double.MAX_VALUE;

    if (!livrariaMap.isEmpty()) {
      for (Livro livro : livrariaMap.values()) {
        if (livro.getPreco() < precoMaisBaixo) {
          precoMaisBaixo = livro.getPreco();
        }
      }
    } else {
      throw new NoSuchElementException("A livraria está vazia!");
    }

    for(Map.Entry<String, Livro> entry: livrariaMap.entrySet()) {
      if(entry.getValue().getPreco() == precoMaisBaixo) {
        Livro livroComPrecoMaisBaixo = livrariaMap.get(entry.getKey());
        livrosMaisBaratos.add(livroComPrecoMaisBaixo);
      }
    }
    return livrosMaisBaratos;
  }
    public static void main(String[] args) {
        LivrariaOnline livros = new LivrariaOnline();

        livros.adicionarLivro("teste", "teste", "teste", 2.0);
        livros.adicionarLivro("teste1", "teste1", "teste1", 2.4);

        
    }


}
