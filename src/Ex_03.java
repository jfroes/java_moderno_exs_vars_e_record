import java.util.ArrayList;

public class Ex_03 {
//    Exercicio 03: Use var em um loop for para iterar sobre uma lista.

    public static void main(String[] args) {
        var frutas = new ArrayList<String>();

        frutas.add("banana");
        frutas.add("maçã");
        frutas.add("pêra");
        frutas.add("abacaxi");
        frutas.add("lichia");

        for(var fruta : frutas){
            System.out.println(fruta);
        }
    }
}
