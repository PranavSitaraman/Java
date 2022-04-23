import java.util.ArrayList;

public class U7_L2_Activity_Three{

  public static ArrayList<Integer> getOdds(ArrayList<Integer> vals){
      // Implement this method as described in the assignment
  ArrayList<Integer> list = new ArrayList<>(vals);
for (int i = list.size() - 1; i >= 0; i--) {
  int elements = list.get(i);  
  if(elements % 2 != 1) {
  list.remove(i);
  }
  
  } 
return list;
}
    
}

