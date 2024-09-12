package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Alunos> alunosSet;

    public GerenciadorAlunos(){
        alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, int matricula, double media){
        alunosSet.add(new Alunos(nome, matricula, media));
    }

    public void removerAluno(int matricula){
        Alunos alunoParaRemover = null;
        if(!alunosSet.isEmpty()){
            for(Alunos a : alunosSet){
                if(a.getMatricula() == matricula){
                    alunoParaRemover = a;
                    break;
                }
            }
        } else {
            System.out.println("Lista vazia");
        }
        alunosSet.remove(alunoParaRemover);
    }

    public Set<Alunos> exibirAlunosPorNome(){
        Set<Alunos> alunosPorNome = new TreeSet<>(alunosSet);
        return alunosPorNome;
    }

    public Set<Alunos> exibirAlunosPorNota(){
        Set<Alunos> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosSet.addAll(alunosPorNota);
        return alunosPorNota;

    }

    public void exibirAlunos(){
        if(!alunosSet.isEmpty()){
            System.out.println(alunosSet);
        } else {
            System.out.println("Lista vazia");
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos alunos = new GerenciadorAlunos();

        alunos.adicionarAluno("Gabriel", 001, 9);
        alunos.adicionarAluno("Diego", 002, 8.5);
        alunos.adicionarAluno("Nicholas", 003, 9.5);
        alunos.adicionarAluno("Julia", 003, 10);
        alunos.adicionarAluno("Maria", 004, 9);

        alunos.exibirAlunos();

        System.out.println(alunos.exibirAlunosPorNome());

        System.out.println(alunos.exibirAlunosPorNota());
    }
}
