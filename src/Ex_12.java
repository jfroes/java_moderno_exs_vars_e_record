import java.util.ArrayList;

public class Ex_12 {
    public static void main(String[] args) {
//        Exercício 12: crie uma lista de livros

        var livros = new ArrayList<Livro>();

//        Exercício 13: Imprima todos os livros com mais de 300 páginas.

        livros.add(new Livro("O Retrato de Dorian Gray", "Oscar Wilde", 492));
        livros.add(new Livro("A Redoma de Vidro", "Sylvia Plath", 300));
        livros.add(new Livro("Dracula", "Bram Stoker", 320));
        livros.add(new Livro("Frankenstein", "Mary Shelley", 290));
        livros.add(new Livro("O Peso do Pássaro Morto", "Aline Bei", 187));

        livros.stream().filter(livro ->livro.paginas() > 300).forEach(System.out::println);


    }
}
