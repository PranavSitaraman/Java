import java.util.Scanner;
public class runner_TemperatureMonth{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number of weeks:");
    int rows = scan.nextInt();
    System.out.println("Enter number of days in a week:");
    int cols = scan.nextInt();
    double[][] mat = new double[rows][cols];
    System.out.println("Enter temperature values:");
    for(int r = 0; r < rows; r++){
      for(int c = 0; c < cols; c++)
        mat[r][c] = scan.nextDouble();
    }
    TemperatureMonth t = new TemperatureMonth(mat);
    System.out.println("\nTemperatures:");
    for(double[] r : mat){
      for(double n : r){
        System.out.print(n + "\t");
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("getMaxTemp: " + t.getMaxTemp());
    System.out.println("getMinTemp: " + t.getMinTemp());
    System.out.println("getMonthlyAverage: " + t.getMonthlyAverage());
    double[] wkAvgs = t.getWeeklyAverages();
    System.out.print("getWeeklyAverages: {");
    for(int i = 0; i < wkAvgs.length - 1; i++){
      System.out.print(wkAvgs[i] + ", ");
    }
    System.out.println(wkAvgs[wkAvgs.length - 1] + "}");
  }
}
