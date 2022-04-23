import java.util.ArrayList;

public class U7_L5_Activity_Two
{

  // Write your selectSort method as described in the assignment
   public static void selectSort(ArrayList<Integer> array) {
   for (int j=0; j < array.size() - 1; j++ ) {
      int min = j;
      for (int k=j+1; k < array.size(); k++ )
        if ( array.get(k) < array.get(min) ) min = k;  

    
      int temp = array.get(j);
      array.set(j, array.get(min));
      array.set(min, temp);
    }
   }
}
