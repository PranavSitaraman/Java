/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section8.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String args[]) {

        int a = 100, res;

        try {
            System.out.println("Enter the value for b");
            Scanner console = new Scanner(System.in);
            int b = console.nextInt();
            System.out.println("Enter the value for c");
            int c = console.nextInt();
            res = 10 / (b - c);
            System.out.println(" The result is " + res);
        } catch (Exception e) {
           String errMsg = e.getMessage();
           System.out.println(errMsg);
        }
        System.out.println("After catch block");
    }
}
