package xyz.oreckz.dnd;

public class Player {
    private int hitMod;
    private int armorClass;
    private int hitPoints;

    public Player() {

    }

    public Player(int hitMod, int armorClass, int hitPoints) {
        super();
        this.hitMod = hitMod;
        this.armorClass = armorClass;
        this.hitPoints = hitPoints;
    }

    public int getArmorClass() {
        final int ac = armorClass;
        return ac;
    }

    public void setArmorClass(int ac) {
        this.armorClass = ac;
    }

    public int getHitMod() {
        final int th = hitMod;
        return th;
    }

    public void setHitMod(int hm){
        this.hitMod = hm;
    }

    public int getHitPoints(){
        final int hp = hitPoints;
        return hp;
    }

    public void setHitPoints(int hp){
        this.hitPoints = hp;
    }

}
