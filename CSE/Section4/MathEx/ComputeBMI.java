/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section4.MathEx;
import java.util.Scanner;
import java.lang.Math;
public class ComputeBMI
{
    public static void main(String[] args)
	{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the weight in pounds: ");
        double weight = in.nextDouble();
        System.out.print("Enter the height in inches: ");
        double height = in.nextDouble();
        int BMI = (int) Math.round(weight/Math.pow(height, 2) * 703.0);
        System.out.println("Your Body Mass Index is " + BMI);
    }
}
