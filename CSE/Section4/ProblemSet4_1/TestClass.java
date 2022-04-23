/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section4.ProblemSet4_1;

/**
 *
 * @author anshenoy
 */

public class TestClass
{

    public static void main(String args[])
    {
        //Create an instance of ComputeMethods
        
        ComputeMethods methods = new ComputeMethods();

        //invoke the 3 methods and dispay their results

        System.out.println("Temp in celsius is " + methods.fToC(100.4));
        System.out.println("Hypotenuse is " + methods.hypotenuse(9, 6));
        System.out.println("The sum of the dice values is " + methods.roll());

    }
}
