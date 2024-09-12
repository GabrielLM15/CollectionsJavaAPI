package set.OperacoesBasicas;

public class Convidados {
    private String nome;
    private int convite;

    public Convidados(String nome, int convite){
        this.nome = nome;
        this.convite = convite;
    }

    public String getNome() {
        return nome;
    }

    public int getConvite() {
        return convite;
    }



    @Override
    public String toString() {
        return "Convidados [nome=" + nome + ", convite=" + convite + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + convite;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Convidados other = (Convidados) obj;
        if (convite != other.convite)
            return false;
        return true;
    }

    
    
}
