/* Unit 2 - Lesson 3 Coding Activity: Question 2 */

import java.util.Scanner;

public class U2_L3_Activity_Two{
  public static void main(String[] args){
  
    /* Write your code here */
  Scanner scan = new Scanner(System.in);
  String word1;
  int word2;
  System.out.println("Enter a string:");
  word1 = scan.nextLine();
  word2 = word1.length();
  word2 = word2 - 1;
  System.out.println(word1.substring(1,word2));
  }
}
