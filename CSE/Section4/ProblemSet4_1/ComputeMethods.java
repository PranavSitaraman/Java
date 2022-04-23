/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section4.ProblemSet4_1;

import java.util.Random;
import java.lang.Math;

public class ComputeMethods
{
    public double fToC(double degreesF)
    {
        return 5.0/9.0 * (degreesF - 32);
    }
    public double hypotenuse(int a, int b)
    {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
    public int roll()
    {
        Random rand = new Random();
        return rand.nextInt(6) + rand.nextInt(6) + 2;
    }
}