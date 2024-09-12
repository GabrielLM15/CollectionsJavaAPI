package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    Set<Contato> agendaContatosSet;

    public AgendaContatos(){
        this.agendaContatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        agendaContatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(agendaContatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        if(!agendaContatosSet.isEmpty()){
            for(Contato c : agendaContatosSet){
                if(c.getNome().startsWith(nome)){
                    contatosPorNome.add(c);
                }
            }
        } else {
            System.out.println("Lista vazia");
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int numero){
        Contato contatoAtualizado = null;
        for(Contato c : agendaContatosSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
    
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("gabriel", 154512);
        agendaContatos.adicionarContato("Daniel", 15445);
        agendaContatos.adicionarContato("Daniel", 45454);
        agendaContatos.adicionarContato("gabriel 123", 748516);
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("gabriel"));
    }
}
