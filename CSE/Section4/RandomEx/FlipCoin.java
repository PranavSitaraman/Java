/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section4.RandomEx;
import java.util.Random;
public class FlipCoin
{
    public static void main(String[] args)
    {
        // 50% chance heads, 50% chance tails
        Random rand = new Random();
        double chance = rand.nextDouble();
        if (chance < 0.5) System.out.println("heads");
        else System.out.println("tails");
    }
}