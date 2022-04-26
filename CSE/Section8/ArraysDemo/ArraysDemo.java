/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section8.ArraysDemo;

/**
 *
 * @author anshenoy
 */
public class ArraysDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int primes[] = {2,3,5,7,11,13,17};
        System.out.println ("Array length: " + primes.length);
        primes[10]=20;

      System.out.println ("The first few prime numbers are:");


        for (int i : primes) {

            System.out.println(i);

        }

    }

}
// TODO code application logic here

