import java.util.ArrayList;

public class U7_L4_Activity_One{
  public static int countInitial(ArrayList<String> list, String letter){

    // Implement the countInitial method as described in the assignment
    int counter = 0;
    
    for(String i: list) {
      if(i.toLowerCase().substring(0,1).equals(letter.toLowerCase())) {
        counter++;
      }
    }
    return counter;
  }
}
