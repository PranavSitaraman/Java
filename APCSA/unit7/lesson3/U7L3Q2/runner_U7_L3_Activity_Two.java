import java.util.Scanner;
import java.util.ArrayList;

public class runner_U7_L3_Activity_Two{

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> nums = new ArrayList<Integer>();
    System.out.println("Enter ArrayList length:");
    int len = scan.nextInt();
    System.out.println("Enter values:");
    for(int i = 0; i < len; i++){
      nums.add(scan.nextInt());
    }
    U7_L3_Activity_Two.printStatistics(nums);
  }
}
