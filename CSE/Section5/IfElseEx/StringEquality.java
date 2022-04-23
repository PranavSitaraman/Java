/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section5.IfElseEx;

/**
 *
 * @author anshenoy
 */

import java.util.Scanner;
public class StringEquality {
   
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a name");
        String name = in.nextLine();
        if (name.equals("Moe"))
        {
            System.out.println("You are the king of rock and roll");
        }
        else
        {
            System.out.println("You are not the king");
        }
    }
}

