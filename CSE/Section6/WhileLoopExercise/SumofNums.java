/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section6.WhileLoopExercise;

import java.util.Scanner;

public class SumofNums {

    public static void main(String args[])
    {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        do
        {
            sum += number;
            System.out.print("Enter a number (-1 to quit): ");
            number = console.nextInt();
        } while (number != -1);
        System.out.println("The sum is " + sum);

    }
}
