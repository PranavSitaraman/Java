/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section6.ProblemSet6_1;

import java.util.Scanner;

public class ValidatePin
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the correct pin: ");
        String validPin = console.nextLine();
        String userPin = "";
        do
        {
            System.out.print("Enter your pin: ");
            userPin = console.nextLine();
        } while (!(userPin.equals(validPin)));
        System.out.println("You have entered the correct pin! You now have access to your account.");
    }
}
