package map.Ordenacao;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AdicionarEventos {
    private Map<LocalDate, Eventos> eventosmap;

    public AdicionarEventos(){
        this.eventosmap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventosmap.put(data, new Eventos(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Eventos> eventosMap = new TreeMap<>(eventosmap);
        System.out.println(eventosMap);
    }

    public void obterProximoEvento(){
        /*eventosmap.keySet();
        eventosmap.values();*/

        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Eventos> eventosMap = new TreeMap<>(eventosmap);

        for(Map.Entry<LocalDate, Eventos> entry : eventosMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O proximo evento " + entry.getValue() + " acontecerá na data: " + entry.getKey());
                break;
            }
        }
    }
}

