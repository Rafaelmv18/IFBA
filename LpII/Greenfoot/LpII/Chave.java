import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chave extends Actor
{
    private int totalChaves;

    public Chave() {
        totalChaves = 0;
    }

    public void adicionarChave() {
        totalChaves++;
    }

    public int getTotalChaves() {
        return totalChaves;
    }

    public boolean podeSalvarPata() {
        return totalChaves >= 2;
    }
}
