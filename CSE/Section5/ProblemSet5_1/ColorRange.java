/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section5.ProblemSet5_1;

import java.util.Scanner;

public class ColorRange
{
    public static void main(String args[])
    {
        System.out.println("Enter a wavelength: ");
        Scanner in = new Scanner(System.in);
        double wavelength = in.nextDouble();
        String color = "";
        if (wavelength >= 380 && wavelength < 450)
        {
            color = "Violet";
        }
        else if (wavelength >= 450 && wavelength < 495)
        {
            color = "Blue";
        }
        else if (wavelength >= 495 && wavelength < 570)
        {
            color = "Green";
        }
        else if (wavelength >= 570 && wavelength < 590)
        {
            color = "Yellow";
        }
        else if (wavelength >= 590 && wavelength < 620)
        {
            color = "Orange";
        }
        else if (wavelength >= 620 && wavelength < 750)
        {
            color = "Red";
        }
        else
        {
            System.out.println("The entered wavelength is not a part of the visible spectrum");
            return;
        }
        System.out.println("The color is " + color);
    }
}