package unit6.U6_Assignment;

import java.util.Arrays;

public class NumStatsArray{

  //Add a final private variable to hold double array
  private final double[] holder;

  public NumStatsArray(double[] a){
    //Write constructor code
    holder = a;
  }

  //Implement all methods as described
  public String toString(){
    String x = "";
    x += "{";
    for (int i = 0; i < holder.length; i++) {
      x += holder[i];
      if (i == holder.length-1) {
        x += "}";
        break;
      }
      x += ", ";
    }
    return x;
  }

  public double average(){
    double indicesAmt = 0;
    double elementAmt = 0;
    
  for(int i = 0; i < holder.length; i++) {
    elementAmt += holder[i];
    indicesAmt++;
  }
    return elementAmt / indicesAmt;
}

  public double range(){
  double maxValue = holder[0]; 
    for(int i = 1; i < holder.length; i++) {  
      if(holder[i] > maxValue){ 
         maxValue = holder[i]; 
      } 
    } 
 
  double minValue = holder[0]; 
    for(int i = 1; i < holder.length; i++) { 
      if(holder[i] < minValue){ 
        minValue = holder[i]; 
      } 
    } 
    return maxValue - minValue;
  }

  public int sortStatus() {
    boolean ascending = true;
    boolean descending = true;
    
    for (int i = 0; i < holder.length - 1; i++) {
    if (holder[i] > holder[i + 1]) {
        ascending = false;
        break;
    }
  }
        
    for (int i = 0; i < holder.length - 1; i++) {
    if (holder[i] < holder[i + 1]) {
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
