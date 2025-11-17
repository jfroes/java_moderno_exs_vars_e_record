import java.util.ArrayList;

public class Ex_08 {
//    Exercicio 08: Crie uma lista de Produto e percorra com for-each.

    public static void main(String[] args) {
        var produtos = new ArrayList<Produto>();

        produtos.add(new Produto("Fone de ouvido", 69.90));
        produtos.add(new Produto("Xbox Series X", 4499.99));
        produtos.add(new Produto("JBL Essential 2", 129.99));
        produtos.add(new Produto("Kindle Color", 1299.99));
        produtos.add(new Produto("Monitor 27\" 4k", 2199.90));

        for (var produto : produtos){
            System.out.println(produto);
        }

    }
}
