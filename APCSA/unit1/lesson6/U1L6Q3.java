/* Unit 1 - Lesson 6 Coding Activity: Question 3 */

import java.util.Scanner;

class U1_L6_Activity_Three {
  public static void main(String[] args) {
    
    /* Write your code here */
    Scanner scan = new Scanner(System.in);
    System.out.println("Please input a decimal number: ");
    double number = scan.nextDouble();
    number = number * 100;
    int number2 = (int) number % 10;
    int number1 = (int) (number % 100 - number2) / 10;
    
    System.out.println("Answer: " + number1 + " " + number2);
  }
}
