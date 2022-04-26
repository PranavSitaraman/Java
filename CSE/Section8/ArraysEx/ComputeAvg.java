/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Section8.ArraysEx;
import java.util.*;
public class ComputeAvg
{
    public static void main(String args[])
    {
        int[] scores = new int[5];
        Scanner in = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter the next score: ");
            scores[i] = in.nextInt();
            sum += scores[i];
        }
        System.out.println("The student's average is " + sum/5.0);
    }
}