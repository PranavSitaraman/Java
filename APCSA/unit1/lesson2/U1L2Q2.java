/* Unit 1 - Lesson 2 Coding Activity: Question 2 */

import java.util.Scanner;

class U1_L2_Activity_Two {
  public static void main(String[] args) {
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    String z1;
    String z2;
    String z3;
    
    System.out.println("Please enter three names:");
    z1 = scan.nextLine();
    z2 = scan.nextLine();
    z3 = scan.nextLine();
    
    System.out.println(z3 + " " + z2 + " " + z1);
  }
}
