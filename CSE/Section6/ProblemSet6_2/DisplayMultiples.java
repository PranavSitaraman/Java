/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section6.ProblemSet6_2;

import java.util.Scanner;

public class DisplayMultiples
{
    public static void main(String args[])
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = console.nextInt();
        for (int i = 1; i <= 12; i++)
        {
            System.out.print((i * num) + " ");
        }
    }
}
