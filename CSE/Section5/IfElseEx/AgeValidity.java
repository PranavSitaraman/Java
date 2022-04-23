/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section5.IfElseEx;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class AgeValidity
{
    public static void main(String[] args)
    {
        boolean drivingUnderAge = false;
        Scanner in = new Scanner(System.in);
        System.out.println("What is your age?");
        System.out.println((drivingUnderAge = (in.nextInt() <= 18 ? true : false)));
    }
}
