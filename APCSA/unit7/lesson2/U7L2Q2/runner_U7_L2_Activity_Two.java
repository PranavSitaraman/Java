import java.util.Scanner;
import java.util.ArrayList;

public class runner_U7_L2_Activity_Two{

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    ArrayList<Double> vals = new ArrayList<Double>();
    System.out.println("Enter ArrayList length:");
    int len = scan.nextInt();
    System.out.println("Enter values:");
    for(int i = 0; i < len; i++){
      vals.add(scan.nextDouble());
    }
    System.out.println("Average: " + U7_L2_Activity_Two.average(vals));
  }
}
