/* Unit 2 - Lesson 2 Coding Activity: Question 1 */

import java.util.Scanner;

public class U2_L2_Activity_One{
  public static void main(String[] args){
  
    /* Write your code here */
  Scanner scan = new Scanner(System.in);
  
  System.out.println("What type of item are you buying?");
  String item = scan.nextLine();
  System.out.println("How many are you buying?");
  int amt = scan.nextInt();
  System.out.println("How much does each one cost?");
  double cost = scan.nextDouble();
  
  double last = cost * amt;
  
  System.out.println(amt + " " + item + " at $" + cost + " each " + "will cost you $" + last);
  }
}
