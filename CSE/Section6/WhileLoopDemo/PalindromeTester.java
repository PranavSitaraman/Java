package Section6.WhileLoopDemo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;


public class PalindromeTester {
  
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = in.next();
        int firstPosition = 0;
        int lastPosition = word.length() - 1;
        boolean isAPalindrome = true;
        while (firstPosition < lastPosition) {
            if (word.charAt(firstPosition) != word.charAt(lastPosition)) {
                isAPalindrome = false;
            }
            firstPosition++;
            lastPosition--;
        }
        if (isAPalindrome) {
            System.out.println("The word is a Palindrome");
        } else {
            System.out.println("The word is not a Palindrome");
        }

    }
}


