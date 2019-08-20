package xyz.oreckz.dnd;

import java.util.Random;

public class Dice {
    private static int result;
    private static Random rand = new Random();

    public Dice() {}


    public static int d20(){
        // Result is a random integer from 0 - 19 so we add one to replicate a d20
        result = rand.nextInt(20) + 1;
        return result;
    }

    public static int d12(){
        result = rand.nextInt(12) + 1;
        return result;
    }

    public static int d10(){
        result = rand.nextInt(10) + 1;
        return result;
    }

    public static int d8(){
        result = rand.nextInt(8) +1;
        return result;
    }
}
