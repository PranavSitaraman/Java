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
public class ComputeFare
{
    public static void main(String args[])
    {
        System.out.println("Enter the age");
        Scanner keyboard = new Scanner(System.in);
        int age = keyboard.nextInt();
        int fare = (age < 11 ? 3 : (age > 11 && age < 65 ? 5 : 3));
        System.out.println("The fare is $" + fare);

    }
}
