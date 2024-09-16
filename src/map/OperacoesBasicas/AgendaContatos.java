package map.OperacoesBasicas;
import java.util.Map;
import java.util.HashMap;

public class AgendaContatos {
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos(){
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContatos(String nome, Integer numero){
        agendaContatosMap.put(nome, numero);
    }

    public void removerContatos(String nome){
        if(!agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatosMap.isEmpty()){
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContatos("gabriel", 123457);
        agendaContatos.adicionarContatos("deigo", 12455415);

        agendaContatos.exibirContatos();

        agendaContatos.removerContatos("deigo");

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("gabriel"));
    }
}
