/* Unit 3 - Lesson 2 Coding Activity: Question 2 */

import java.util.Scanner;

public class U3_L2_Activity_Two{
  public static void main(String[] args){
    
    /* Write your code here */
  Scanner scan = new Scanner(System.in);
  System.out.println("Please enter two numbers:");
  double a = scan.nextDouble();
  double b = scan.nextDouble();
  
  if (a >= b)
  System.out.println("Largest is: " + a);
  
  if (b > a)
  System.out.println("Largest is: " + b);
    
  }
}
