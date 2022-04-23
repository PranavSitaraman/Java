package Section6.BreakContinueEx;

import java.util.Scanner;

public class ComputeSum
{
    public static void main(String[] args)
    {
        System.out.println("Please enter 10 numbers.\nEnter 0 to exit.");
        Scanner console = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++)
        {
            int number = console.nextInt();
            if (number == 0) break;
            sum += number;
        }
        System.out.println("The sum of the numbers entered is " + sum + ".");
    }
}
