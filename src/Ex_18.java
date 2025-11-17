import java.util.ArrayList;

public class Ex_18 {
//    Exercicio 18: Use toString() padrão de um record para logar informações.
        public static void main(String[] args) {
            var livros = new ArrayList<Livro>();


            livros.add(new Livro("O Retrato de Dorian Gray", "Oscar Wilde", 492));
            livros.add(new Livro("A Redoma de Vidro", "Sylvia Plath", 300));
            livros.add(new Livro("Dracula", "Bram Stoker", 320));
            livros.add(new Livro("Frankenstein", "Mary Shelley", 290));
            livros.add(new Livro("O Peso do Pássaro Morto", "Aline Bei", 187));

            livros.forEach(System.out::println);
        }
}
