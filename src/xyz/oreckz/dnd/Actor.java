package xyz.oreckz.dnd;

public class Actor {

     String name;
     int hitMod;
     int armorClass;
     int health;
     int difficultyClass;

    Actor() {}

    public Actor(String name, int hitMod, int armorClass, int health, int difficultyClass){
        super();
        this.name = name;
        this.hitMod = hitMod;
        this.armorClass = armorClass;
        this.health = health;
        this.difficultyClass = difficultyClass;
    }

    public int getHitMod() {
        final int hm = this.hitMod;
        return hm;
    }

    public void setHitMod(int hm){
        this.hitMod = hm;
    }

    int getArmorClass(){
        final int ac = this.armorClass;
        return  ac;
    }

    public void setArmorClass(final int ac){
        this.armorClass = ac;
    }

    int getHealth(){
        final int hp = this.health;
        return hp;
    }

    public void setHealth(final int hp){
        this.health = hp;
    }

    String getName(){
        final String name = this.name;
        return name;
    }

    void setName(String n){
         this.name = n;
    }

    int getDifficultyClass(){
        final int dc = this.difficultyClass;
        return dc;
    }

    void setDifficultyClass(int dc){
        this.difficultyClass = dc;
    }

    int damageRoll() {
        return (2* Dice.d8()) + 1;
    }
}
