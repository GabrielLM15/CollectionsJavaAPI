package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    private List<Livro> livrolist;

    public CatalagoLivros() {
        this.livrolist = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrolist.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisaPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livrolist.isEmpty()){
            for(Livro l : livrolist){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livrolist.isEmpty()){
            for(Livro l :livrolist){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livrosPorTitulo = null;
        if(!livrolist.isEmpty()){
            for(Livro l: livrolist){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livrosPorTitulo = l;
                    break;
                }
            }
        }
        return livrosPorTitulo;
    }
    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();

        catalagoLivros.adicionarLivro("Diario Banana", "Jose Borges", 2024);
        catalagoLivros.adicionarLivro("Diario Vampiro", "Jose Araujo", 2015);
        catalagoLivros.adicionarLivro("Diario", "Jose Borges", 2003);
        catalagoLivros.adicionarLivro("Harry Potter", "Jose Augusto", 2024);
        catalagoLivros.adicionarLivro("Diario Ana", "Ana", 2000);

        System.out.println(catalagoLivros.pesquisaPorAutor("Jose Borges"));
        System.out.println(catalagoLivros.pesquisarPorIntervaloAnos(2000, 2010));
        System.out.println(catalagoLivros.pesquisarPorTitulo("Diario Banana"));
    }
    
}
