import java.util.ArrayList;

public class Ex_01 {
//    Exercicio 01: Use var para declarar variáveis de diferentes tipos e exiba seus valores.

    public static void main(String[] args) {
        var nome = "José";
        var nomes = new ArrayList<String>();
        var valor = 10.99;

        nomes.add(nome);
        nomes.add("Maria");
        nomes.add("Luiz");

        System.out.println("var nome: " + nome);
        System.out.println("var valor: " + valor);

        System.out.println("var nomes ArrayList<String>: ");
        nomes.forEach(System.out::println);

    }
}
