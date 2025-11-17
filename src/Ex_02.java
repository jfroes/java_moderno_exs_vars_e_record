import java.util.ArrayList;

public class Ex_02 {
//    Exercicio 02: Crie uma lista com var e adicione 5 nomes.

    public static void main(String[] args) {
        var nomes = new ArrayList<String>();

        nomes.add("John");
        nomes.add("Leo");
        nomes.add("Martin");
        nomes.add("Zack");
        nomes.add("Alex");

        nomes.forEach(System.out::println);
    }
}
