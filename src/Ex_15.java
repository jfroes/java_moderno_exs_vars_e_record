import java.util.ArrayList;

public class Ex_15 {
//  Exercicio 15: Crie um record Aluno(String nome, double nota) e ordene uma lista por nota.

    public static void main(String[] args) {

        var alunos = new ArrayList<Aluno>();

        alunos.add( new Aluno("Alice", 9.5));
        alunos.add( new Aluno("Bruno", 7.0));
        alunos.add( new Aluno("Carla", 8.2));
        alunos.add( new Aluno("Diego", 6.7));
        alunos.add( new Aluno("Elaine", 9.8));
        alunos.add( new Aluno("Fernando", 5.9));
        alunos.add( new Aluno("Gabriela", 7.6));
        alunos.add( new Aluno("Henrique", 8.9));
        alunos.add( new Aluno("Isabela", 10.0));
        alunos.add( new Aluno("João", 6.3));

        alunos.sort((a1, a2) -> Double.compare(a2.nota(), a1.nota()));

        alunos.forEach(System.out::println);



    }
}
