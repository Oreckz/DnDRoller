package xyz.oreckz.dnd;

import java.util.Random;

public class Dice {
    private Random rand = new Random();
    private int result;

    public Dice(Random rand, int faces) {
        this.rand = rand;
    }

    public Dice() {}


    public int d20(){
        result = rand.nextInt(20);
        return result;
    }

    public int d12(){
        result = rand.nextInt(12);
        return result;
    }
}
