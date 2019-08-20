package test;

import org.junit.Test;

public class DiceTests {

    public static void main(String[] args) {
         xyz.oreckz.dnd.Dice die = new xyz.oreckz.dnd.Dice();

         for (int i=1; i<100; i++) {

             int result = die.d20();
             System.out.println(result);

             //This should not happen
             if(result == 0 || result > 20){
                 Exception rollOutOfBounds;
                 rollOutOfBounds = new ArithmeticException("Roll out of bounds");
                 try {
                     throw rollOutOfBounds;
                 } catch (Exception e) {
                     e.printStackTrace();
                     break;
                 }
             }
         }
    }
}
