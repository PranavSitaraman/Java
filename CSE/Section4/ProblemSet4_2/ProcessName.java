/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section4.ProblemSet4_2;

import java.util.Scanner;


public class ProcessName
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Type your name: ");
        String fullName = console.nextLine();
        System.out.println("Your name is: " + fullName.substring(fullName.indexOf(" ") + 1, fullName.length()) + ", " + fullName.charAt(0) + ".");
    }
}