package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> listaTarefasSet;

    public ListaTarefas(){
        this.listaTarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if(!listaTarefasSet.isEmpty()){
            for(Tarefa t : listaTarefasSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = t;
                    break;
                } else {
                    System.out.println("Palavra não encontrada");
                }
            }
            listaTarefasSet.remove(tarefaParaRemover);
        } else {
            System.out.println("Lista vazia");
        }
    }

    public void exibirTarefa(){
        if(!listaTarefasSet.isEmpty()){
            System.out.println(listaTarefasSet);
        } else {
            System.out.println("Lista vazia");
        }
    }

    public int contarTarefas(){
        return listaTarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!listaTarefasSet.isEmpty()){
            for(Tarefa t: listaTarefasSet){
                if(t.isConcluido()){
                    tarefasConcluidas.add(t);
                }
            }
        } else {
            System.out.println("Lista vazia");
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!listaTarefasSet.isEmpty()){
            for(Tarefa t : listaTarefasSet){
                if(!t.isConcluido()){
                    tarefasPendentes.add(t);
                }
            }
        } else {
            System.out.println("Lista vazia");
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        if(!listaTarefasSet.isEmpty()){
            for(Tarefa t: listaTarefasSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluido(true);
                }
            }
        } else {
            System.out.println("Lista vazia");
        }
    }

    public void marcarTarefaPendente(String descricao){
        if(!listaTarefasSet.isEmpty()){
            for(Tarefa t : listaTarefasSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluido(false);
                }
            }
        } else{
            System.out.println("Lista vazia");
        }
    }

    public void limparListaTarefas(){
        if(listaTarefasSet.isEmpty()){
            System.out.println("Lista vazia");
        } else {
            listaTarefasSet.clear();
        }
        
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

    // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        listaTarefas.exibirTarefa();

        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefa();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaConcluida("Ler livro");

        System.out.println(listaTarefas.obterTarefasConcluidas());

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefa();

    }
}
