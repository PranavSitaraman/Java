/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section5.ProblemSet5_2;

import java.util.Scanner;

public class TrafficLightChecker
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a color code");
        int currentColor = in.nextInt();
        if (currentColor == 1)
        {
            System.out.println("Next Traffic Light is green");
        }
        else if (currentColor == 2)
        {
            System.out.println("Next Traffic Light is yellow");
        }
        else if (currentColor == 3)
        {
            System.out.println("Next Traffic Light is red");
        }
        else
        {
            System.out.println("Invalid color");
        }
    }
}
