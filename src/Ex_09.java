public class Ex_09 {
//    Exercício 09: Teste igualdade de dois records com .equals().

    public static void main(String[] args) {
        var pessoa1 = new Pessoa("Joaquin", 14);
        var pessoa2 = new Pessoa("Bernardo", 9);

        System.out.println(pessoa1.equals(pessoa2));
    }
}
