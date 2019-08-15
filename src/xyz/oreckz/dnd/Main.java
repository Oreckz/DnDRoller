package xyz.oreckz.dnd;

import java.util.Scanner;
import java.io.Console;


public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to DNDRoller");
        Scanner input = new Scanner(System.in);

        Dice dice = new Dice();
        int roll = dice.d20();

        System.out.println("\nThe dice rolled a " + roll + ".");

        Player player = new Player(5, 20);
        NPC npc = new NPC(15, 10, 4);
        System.out.println("NPC Armour Class is " + npc.getArmorclass());

        if (roll + player.getHitMod() >= npc.getArmorclass()) {
            System.out.println("HIT");
        } else {
            System.out.println("MISS");
        }


        int enemyRoll = npc.attackRoll();
        System.out.println("Enemy Rolls " + enemyRoll);

        if (enemyRoll + npc.getHitMod() >= player.getArmorClass()) {
            System.out.println("HIT");
        } else {
            System.out.println("MISS");
        }


    }
}
