package xyz.oreckz.dnd;

import java.util.Random;

public class NPC {
    private final Random ac;
    private final int dc;

    public NPC(int dc) {
        this.ac = new Random();
        this.dc = dc;
    }

    public int armorClass(){
        return 1 + ac.nextInt(dc);
    }

}
