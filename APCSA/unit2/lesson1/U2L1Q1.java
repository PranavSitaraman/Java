/* Unit 2 - Lesson 1 Coding Activity: Question 1 */

import java.util.Scanner;

public class U2_L1_Activity_One{
  public static void main(String[] args){
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    
    System.out.println("What is your name?");
    String name = scan.nextLine();
    System.out.println("What is your age?");
    String age = scan.nextLine();
    System.out.println(name + " is " + age + " years old.");
  }
}
