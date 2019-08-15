package xyz.oreckz.dnd;


public class NPC {
    private final int armorClass;
    private final int dc;
    private int hitMod;

    public NPC(int ac, int dc, int hitMod) {
        this.armorClass = ac;
        this.dc = dc;
        this.hitMod = hitMod;
    }

    public int getArmorclass() {
        int ac = armorClass;
        return ac;
    }
    
    public int attackRoll() {
        Dice dice = new Dice();
        return dice.d20() + hitMod;
    }

    public int getHitMod() {
        final int hm = hitMod;
        return hm;
    }

}
