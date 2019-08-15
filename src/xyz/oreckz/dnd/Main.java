package xyz.oreckz.dnd;

import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Dice Roller\n");
        System.out.println("How many faces does the dice have?");
        Dice dice = new Dice(input.nextInt());
        int result = dice.d20();
        System.out.println("\nThe dice rolled a " + result + ".");

        System.out.println("NPC AC");
        System.out.println("What is the DC of the NPC?");
        NPC npc = new NPC(input.nextInt());
        int enemyAC = npc.armorClass();
        System.out.println("NPC Armour Class is " + enemyAC);

        if (result >= enemyAC) {
            System.out.println("HIT");
        } else {
            System.out.println("MISS");
        }

    }
}
