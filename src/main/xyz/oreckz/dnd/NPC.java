package xyz.oreckz.dnd;


public class NPC {
    private int armorClass;
    private int dc;
    private int hitMod;
    private int hitPoints;

    public NPC(int ac, int dc, int hitMod, int hitPoints) {
        this.armorClass = ac;
        this.dc = dc;
        this.hitMod = hitMod;
        this.hitPoints = hitPoints;
    }

    public int getArmorclass() {
       final int ac = armorClass;
        return ac;
    }

    public void setArmorClass(int ac){
        this.armorClass = ac;
    }

    public int getHitMod() {
        final int hm = hitMod;
        return hm;
    }

    public void setHitMod(int hm){
        this.hitMod = hm;
    }

    public int getHitpoints(){
        final int hp = hitPoints;
        return hp;
    }

    public void setHitPoints(int hp){
        this.hitPoints = hp;
    }
}
