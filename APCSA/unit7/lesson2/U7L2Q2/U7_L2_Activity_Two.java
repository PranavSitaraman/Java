import java.util.ArrayList;

public class U7_L2_Activity_Two{

  // write your average method here

public static double average(ArrayList<Double> a) {
  double total = 0;
  
  for (int i = 0; i < a.size(); i++) {
    total += a.get(i);
  }
return total / a.size();  
}

}
