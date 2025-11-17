public class Ex_10 {
//    Exercício 10: Mostre o hashCode() de um objeto record.

    public static void main(String[] args) {
        var produto = new Produto("iPhone 17 PRO Max", 8499.99);

        System.out.println(produto.hashCode());

    }
}
