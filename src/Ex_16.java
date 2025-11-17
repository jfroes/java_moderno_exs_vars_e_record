import java.util.ArrayList;
import java.util.List;

public class Ex_16 {
    public static void main(String[] args) {
//    Exercicio 16: Crie uma função que recebe uma lista de record e devolve apenas os aprovados (nota ≥ 7).
        var alunos = new ArrayList<Aluno>();

        alunos.add( new Aluno("Alice", 9.5));
        alunos.add( new Aluno("Bruno", 4.0));
        alunos.add( new Aluno("Carla", 8.2));
        alunos.add( new Aluno("Diego", 2.7));
        alunos.add( new Aluno("Elaine", 5.8));
        alunos.add( new Aluno("Fernando", 5.9));
        alunos.add( new Aluno("Gabriela", 7.6));
        alunos.add( new Aluno("Henrique", 8.9));
        alunos.add( new Aluno("Isabela", 10.0));
        alunos.add( new Aluno("João", 6.3));

        var aprovados = filterAprovados(alunos);

        aprovados.forEach(System.out::println);

    }

    public static List<Aluno> filterAprovados(List<Aluno> alunos){

        return alunos.stream().filter(aluno -> aluno.nota() > 6.0).toList();
    }
}
