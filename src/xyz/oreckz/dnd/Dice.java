package xyz.oreckz.dnd;

import java.util.Random;

public class Dice {
    private static int result;
    private static Random rand = new Random();

    public Dice() {}


    public static int d20(){
        result = rand.nextInt(20);
        return result;
    }

    public static int d12(){
        result = rand.nextInt(12);
        return result;
    }
}
