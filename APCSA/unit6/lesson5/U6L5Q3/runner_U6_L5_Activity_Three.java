import java.util.Scanner;
public class runner_U6_L5_Activity_Three{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter array length:");
    int len = scan.nextInt();
    double[] nums = new double[len];
    System.out.println("Enter values:");
    for(int i = 0; i < len; i++){
      nums[i] = scan.nextDouble();
    }
    System.out.println(U6_L5_Activity_Three.avg(nums));
  }
}
