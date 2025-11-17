import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//  Exercicio 15: Crie um record Aluno(String nome, double nota) e ordene uma lista por nota.
public record Aluno(String nome, double nota) {

//    Exercicio 17: Adicione um méthodo no record que retorna “Aprovado/Reprovado”.
    public String isAprovado(Aluno aluno){
        return aluno.nota() > 6 ? "Aprovado"  : "Reprovado";
    }


}
