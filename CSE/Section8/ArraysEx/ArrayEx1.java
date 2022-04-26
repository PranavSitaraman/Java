/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Section8.ArraysEx;
import java.util.*;
public class ArrayEx1
{
    public static void main(String args[])
    {
        
        int[] primeNum = new int[20];
        int[] even = new int[5];
        long[] primes = new long[20];
        primes[0] = 2;
        primes[1] = 3;
        long[] primes2 = primes;
        System.out.println(primes2[0]);
        primes2[0] = 5;
        System.out.println(primes[0]);
        int[] score = new int[9];
        byte[] values = new byte[10];
        Arrays.fill(values, (byte)1);
    }
}