/* Unit 2 - Lesson 6 Coding Activity: Question 2 */

import java.util.Scanner;
import edhesive.shapes.*;

public class U2_L6_Activity_Two{
  public static void main(String[] args){
  
    /* Write your code here */
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter radius: ");
  double rad = scan.nextDouble();
  Circle test1 = new Circle(rad);
  double first = test1.getArea();
  System.out.println("Area: " + first);
  System.out.println("Radius is being doubled...");
  
  double newrad = test1.getRadius() * 2.0;
  test1.setRadius(newrad);
  double second = test1.getArea();
  
  System.out.println("Area: " + second);

  
  
  
  }
}
