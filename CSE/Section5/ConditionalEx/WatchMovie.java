/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section5.ConditionalEx;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class WatchMovie {

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the movie ticket price");
        double price = in.nextDouble();
        System.out.println("Enter the movie rating");
        double rating = in.nextDouble();
        if (price >= 12 && rating == 5)
        {
            System.out.println("I'm interested in watching the movie");
        }
        else
        {
            System.out.println("I am not interested in watching the movie");
        }

    }
}
