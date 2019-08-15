package xyz.oreckz.dnd;

import java.util.Random;

public class Dice {
    private final Random rand;
    private final int faces;
    private int result;


    public Dice(int faces) {
        this.rand = new Random();
        this.faces = faces;
    }

    public int roll() {
        return 1 + rand.nextInt(faces);
    }

    public int d20(){
        result = rand.nextInt(20);
        return result;
    }

    public int d12(){
        result = rand.nextInt(12);
        return result;
    }
}
