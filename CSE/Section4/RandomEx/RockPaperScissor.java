/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section4.RandomEx;
import java.util.Random;
public class RockPaperScissor
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        double choice = rand.nextInt(3);
        if (choice == 0) System.out.println("rock");
        else if (choice == 1) System.out.println("paper");
        else if (choice == 2) System.out.println("scissors");
    }
}
