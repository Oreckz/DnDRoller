package xyz.oreckz.dnd;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        System.out.println("Welcome to DNDRoller");

        Scanner scanner = new Scanner(System.in);

        Player player  = new Player("Patrick", "Fighter", 4, 15,20 );
        Actor npc = new Actor("NPC",12,12,20, 10);

        System.out.println("Enter Player name: ");
        player.setName(scanner.nextLine());
        System.out.println("Player name is " + player.getName());


        System.out.println("Player AC is " + player.getArmorClass());
        System.out.println("Player HP is " + player.getHealth());
        System.out.println("Enemy AC is " + npc.getArmorClass());
        System.out.println("Enemy HP is " + npc.getHealth());

        int round = 1;

        while (true) {
            final int npcHitPoints = npc.getHealth();
            if (npcHitPoints <= 0){
                System.out.println(player.getName() + " Wins!");
                break;
            }
            final int playerHitPoints = player.getHitPoints();
            if (playerHitPoints <= 0){
                System.out.println(npc.getName() + " Wins!");
                break;
            }

            System.out.println("Round " + round);

            int playerRoll = Dice.d20();
            System.out.println("The Player rolled a " + playerRoll + ".");
            System.out.println("The Player applies a Hit Modifier of " + player.getHitMod());

            if (playerRoll + player.getHitMod() >= npc.getArmorClass()) {
                System.out.println("HIT");
                npc.setHealth(npc.getHealth() - player.damageRoll());
                System.out.println("Enemy takes 5 points of damage");
            } else {
                System.out.println("MISS against enemy AC of " + npc.getArmorClass());
            }


            int enemyRoll = Dice.d20();
            System.out.println("Enemy Rolls " + enemyRoll);
            System.out.println("Enemy adds Hit Modifier of " + npc.getHitMod());

            if (enemyRoll + npc.getHitMod() >= player.getArmorClass()) {
                System.out.println("HIT");
                player.setHitPoints(player.getHitPoints() - npc.damageRoll());
                System.out.println("Player takes 5 points of damage");
            } else {
                System.out.println("MISS against Player AC of " + player.getArmorClass());
            }

            System.out.println("Player HP remaining " + player.getHitPoints());
            System.out.println("Enemy HP remaining " + npc.getHealth());
            System.out.println("End of Turn");
        }
        System.out.println("End of Game");
    }
}
