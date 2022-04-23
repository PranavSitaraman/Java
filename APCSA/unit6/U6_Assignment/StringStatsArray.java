package unit6.U6_Assignment;

import java.util.Arrays;

public class StringStatsArray{

  //Add a final private variable to hold String array
  private final String[] holder;

  public StringStatsArray(String[] a){
    //Write constructor code
    holder = a;
  }

  //Implement all methods as described
  public String toString(){
    String str0 = "" + Arrays.toString(holder);
    str0 = str0.replace("[", "{\"");
    str0 = str0.replace("]", "\"}");
    str0 = str0.replaceAll(", ", "\", \"");
    return str0;
  }

  public double averageLength(){
   int indicesAmt = 0;
   int elementAmt = 0;
    
  for(int i = 0; i < holder.length; i++) {
    elementAmt += holder[i].length();
    indicesAmt++;
  }
    return (double) elementAmt / indicesAmt;
}

  public int search(String target){
    for (int i = 0; i < holder.length; i++) {
    if(holder[i].equals(target)){
        return i;
    }
}
  return -1;
}

  public int sortStatus() {
    boolean ascending = true;
    boolean descending = true;
    
    for (int i = 1; i < holder.length; i++) {
    if (holder[i].compareTo(holder[i - 1]) < 0) {
         ascending = false;
         break;
    }
}
        
    for (int i = 1; i < holder.length; i++) {
    if (holder[i].compareTo(holder[i - 1]) > 0) {
        descending = false;
        break;
    }
  }
    
    if(ascending == true)
    return 1;
    
    else if(descending == true)
    return -1;
    
    else
    return 0;
  } 
}
