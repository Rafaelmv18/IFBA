import greenfoot.*;
public class Cesta extends Actor {
    private int totalFrutas = 0;  // Quantidade de frutas armazenadas na cesta

    public void act() {
        // Aqui você pode adicionar a lógica para o comportamento da cesta
    }

    public void adicionarFrutas(int quantidade) {
        totalFrutas += quantidade;  // Adiciona a quantidade de frutas coletadas
    }
}