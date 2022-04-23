package unit2;

/* Unit 2 - Assignment 2: Control Tower */
/* Class name - must be "Assignment2" in order to run */

import java.util.Scanner;

class Airplane
{
  private double distance;
  private int direction;
  private int altitude;
  private String callSign;

  public Airplane(String cs, double dist, int dir, int alt){
    distance = Math.abs(dist);
    direction = dir % 360;
    altitude = Math.abs(alt);
    callSign = cs;
  }

  public Airplane(){
    this("AAA01", 1, 0, 0);
  }

  public void gainAlt(){
    altitude += 1000;
  }

  public void loseAlt(){
    altitude -= 1000;
    if(altitude < 0)
      altitude = 0;
  }

  public int getAlt(){
    return altitude;
  }

  public void move(double dist, int dir){
    double r1 = distance;
    double r2 = dist;
    double u1 = Math.toRadians(direction);
    double u2 = Math.toRadians(dir);
    distance = Math.sqrt(r1*r1 + r2*r2 + 2*r1*r2*Math.cos(u2-u1));
    double ang = Math.atan2(r1*Math.sin(u1) + r2*Math.sin(u2), r1*Math.cos(u1) + r2*Math.cos(u2));
    direction = Math.floorMod((int) Math.round(Math.toDegrees(ang)), 360);
  }

  public String toString(){
    String s = callSign + " - ";
    s += (double)Math.round(100*distance)/100;
    s += " miles away at bearing ";
    if(direction < 100)
      s += "0";
    if(direction < 10)
      s += "0";
    s += direction + "\u00b0, altitude " + altitude + " feet";
    return s;
  }

  public double distTo(Airplane other){

    double r1 = this.distance;
    double r2 = other.distance;
    double u1 = Math.toRadians(this.direction);
    double u2 = Math.toRadians(other.direction);
    double between = Math.sqrt(r1*r1 + r2*r2 - 2*r1*r2*Math.cos(u2-u1));
    return (double)Math.round(100*between)/100;
  }
}

public class U2_Assignment
{
  public static void main(String[] args)
  {
    /* Write your code here */
  Scanner scan = new Scanner(System.in);
  
  Airplane a1 = new Airplane();
  System.out.println("Enter the details of the second airplane (call-sign, distance, bearing, and altitude:");
  String a2name = scan.nextLine();
  
  double dist2 = scan.nextDouble();
  int dir2 = scan.nextInt();
  int alt2 = scan.nextInt();
  
  Airplane a2 = new Airplane(a2name.toUpperCase(), dist2, dir2, alt2);
  
  int alt1 = a1.getAlt();
  int alt3 = Math.abs(alt2 - alt1);
  double dist3 = a1.distTo(a2);
  
  System.out.println("\nInitial Positions: ");
  System.out.println("\"Airplane 1\": " + a1);
  System.out.println("\"Airplane 2\": " + a2);
  System.out.println("The distance between the planes is " + dist3 + " miles.");
  System.out.println("The difference in height between the planes is " + alt3 + " feet.");
  
  /*New position code starts here: */
  a1.gainAlt();
  a1.gainAlt();
  a1.gainAlt();
  a1.gainAlt();

  a2.loseAlt();
  a2.loseAlt();
  
  alt1 = a1.getAlt();
  alt2 = a2.getAlt();
  alt3 = Math.abs(alt2 - alt1);
  
  a1.move(10.5, 50);
  a2.move(8.0, 125);
  
  dist3 = a1.distTo(a2);
  
  System.out.println("\nNew Positions: ");
  System.out.println("\"Airplane 1\": " + a1);
  System.out.println("\"Airplane 2\": " + a2);
  System.out.println("The distance between the planes is " + dist3 + " miles.");
  System.out.println("The difference in height between the planes is " + alt3 + " feet.");
    
    
  }
}
