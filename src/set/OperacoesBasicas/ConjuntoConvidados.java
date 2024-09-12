package set.OperacoesBasicas;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados{
    private Set<Convidados> convidadosSet;

    public ConjuntoConvidados(){
        this.convidadosSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigo){
        convidadosSet.add(new Convidados(nome, codigo));
    }

    public void removerConvidadoPorCodigo(int codigo){
        Convidados convidadoParaRemover = null;
        for(Convidados c : convidadosSet){
            if(c.getConvite() == codigo){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Convidado 1", 1000);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1001);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1001);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1002);

        System.out.println(conjuntoConvidados.contarConvidados());

        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigo(1002);

        conjuntoConvidados.exibirConvidados();
    }   
}