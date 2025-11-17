public record Coordenada(double x, double y) {
//  Exercício 11: Use record para representar uma coordenada 2D (x, y) e calcule a distância entre pontos.

    public Double distancia(Coordenada outra){
        double diferenca1 = Math.pow((outra.x - this.x), 2);
        double diferencaOutra = Math.pow((outra.y - this.y), 2);


        return Math.sqrt((diferenca1 + diferencaOutra));
    }
}
