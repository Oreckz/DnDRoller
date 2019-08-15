package xyz.oreckz.dnd;

public class Player {
    private int hitMod;
    private int armorClass;

    public Player() {

    }

    public Player(int hitMod, int armorClass) {
        super();
        this.hitMod = hitMod;
        this.armorClass = armorClass;
    }

    public int getArmorClass() {
        final int ac = armorClass;
        return ac;
    }

    public int getHitMod() {
        final int th = hitMod;
        return th;
    }
}
