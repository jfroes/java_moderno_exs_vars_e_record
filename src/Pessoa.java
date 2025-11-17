//    Exercicio 04: Crie um record chamado Pessoa(String nome, int idade).
public record Pessoa(String nome, int idade) {

//    Exercicio 06: Adicione um méthodo dentro do record que retorna uma saudação.
    public String saudacao(){
        return "Olá, eu sou " + this.nome;
    }
}
