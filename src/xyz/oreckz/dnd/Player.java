package xyz.oreckz.dnd;

public class Player extends Actor {
    private String characterClass;

    public Player(String name, String characterClass, int hitMod, int armorClass, int health) {
        super();
        this.name = name;
        this.characterClass = characterClass;
        this.hitMod = hitMod;
        this.armorClass = armorClass;
        this.health = health;
    }

    public int getHitPoints(){
        final int hp = health;
        return hp;
    }

    public void setHitPoints(int hp){
        this.health = hp;
    }

}
