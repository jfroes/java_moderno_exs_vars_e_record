import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class Ex_19 {
//    Exercicio 19: Crie uma lista de record e serialize para JSON (com Gson ou Jackson).
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        var livros = new ArrayList<Livro>();


        livros.add(new Livro("O Retrato de Dorian Gray", "Oscar Wilde", 492));
        livros.add(new Livro("A Redoma de Vidro", "Sylvia Plath", 300));
        livros.add(new Livro("Dracula", "Bram Stoker", 320));
        livros.add(new Livro("Frankenstein", "Mary Shelley", 290));
        livros.add(new Livro("O Peso do Pássaro Morto", "Aline Bei", 187));

        try {
            String json = mapper.writeValueAsString(livros);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
        }
    }
}

