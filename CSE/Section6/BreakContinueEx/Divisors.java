package Section6.BreakContinueEx;

import java.util.Scanner;

public class Divisors
{
    public static void main(String args[])
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number :  ");
        int num = console.nextInt(); // enter original number to find the divisors of
        System.out.print("Divisors of " + num + " " + "=" + " ");
        for (int i = 1; i < num; i++) // iterate for all positive integers less than num
        {
            if (num % i != 0) // if i doesn't divide num
            {
                continue; // don't print it
            }
            System.out.print(i + ", ");
        }
    }
}
