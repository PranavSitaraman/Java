public class U6_L5_Activity_Three{

  public static double avg(double[] arr){
    double s = 0;
    for(double n : arr){
      s += n;
    }
    s = s / arr.length;
    return s;
  }
}
