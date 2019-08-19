package xyz.oreckz.dnd;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();
        System.out.println("Welcome to DNDRoller");

        Player player = new Player(5, 20, 20);
        NPC npc = new NPC(15, 10, 4, 20);
        System.out.println("Player AC is " + player.getArmorClass());
        System.out.println("Player HP is " + player.getHitPoints());
        System.out.println("Enemy AC is " + npc.getArmorclass());
        System.out.println("Enemy HP is " + npc.getHitpoints());

        int round = 1;

        while (true) {
            final int npcHitPoints = npc.getHitpoints();
            if (npcHitPoints <= 0){
                System.out.println("Player wins");
                break;
            }
            final int playerHitPoints = player.getHitPoints();
            if (playerHitPoints <= 0){
                System.out.println("NPC wins");
                break;
            }

            System.out.println("Round " + round);

            int playerRoll = Dice.d20();
            System.out.println("The Player rolled a " + playerRoll + ".");
            System.out.println("The Player applies a Hit Modifier of " + player.getHitMod());

            if (playerRoll + player.getHitMod() >= npc.getArmorclass()) {
                System.out.println("HIT");
                npc.setHitPoints(npc.getHitpoints() - 5);
                System.out.println("Enemy takes 5 points of damage");
            } else {
                System.out.println("MISS against enemy AC of " + npc.getArmorclass());
            }


            int enemyRoll = Dice.d20();
            System.out.println("Enemy Rolls " + enemyRoll);
            System.out.println("Enemy adds Hit Modifier of " + npc.getHitMod());

            if (enemyRoll + npc.getHitMod() >= player.getArmorClass()) {
                System.out.println("HIT");
                player.setHitPoints(player.getHitPoints() - 5);
                System.out.println("Player takes 5 points of damage");
            } else {
                System.out.println("MISS against Player AC of " + player.getArmorClass());
            }

            System.out.println("Player HP remaining " + player.getHitPoints());
            System.out.println("Enemy HP remaining " + npc.getHitpoints());
            System.out.println("End of Turn");
        }
        System.out.println("End of Game");
    }
}
