public class U6_L2_Activity_Two{

  // Write your numEven method here
public static int numEven(int[] vals) {
  int count = 0;
  for(int i = 0; i < vals.length; i++) {
    if(vals[i] % 2 == 0)
    count++;
  }
  return count;
}
}
