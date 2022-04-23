package unit7.U7_Assignment;

import java.util.*;
 
public class GameWheel
{
  private ArrayList<Slice> slices; // List of slices making up the wheel
  private int currentPos;   // Position of currently selected slice on wheel
  private ArrayList <Slice> black = new ArrayList <Slice>();    
  private ArrayList <Slice> red = new ArrayList <Slice>();
  private ArrayList <Slice> blue = new ArrayList <Slice>();
  
  /* Returns string representation of GameWheel with each numbered slice
   * on a new line
   */
  public String toString(){
    //Implement the toString method here
    String answer = "";
    for(int i = 0; i < slices.size(); i++) {
    answer += "\n" + i + " - " + slices.get(i).toString();   
  }
    return answer;
  } 
 
 
  /* Randomizes the positions of the slices that are in the wheel, but without
   * changing the pattern of the colors
   */
  public void scramble()
  {
    //Implement the scramble method here
    split(); //moved clear into the split so that slices starts empty before adding in the elements from the split lists    
    int num;
    
    for(int i = 0; i < 20; i++) {
      if (i % 5 == 0  && black.size() > 0) {  //put the if statements in order from black to blue
                num = (int)(Math.random() * black.size());
                slices.add(black.get(num));
                black.remove(num);
       } else if (i % 2 == 1 && red.size() > 0) {
                num = (int)(Math.random() * red.size());
                slices.add(red.get(num));
                red.remove(num);
       } else if (i % 2 == 0  && blue.size() > 0) { //kept each statement as and else if
                num = (int)(Math.random() * blue.size());
                slices.add(blue.get(num));
                blue.remove(num);
            }
    }
  }
 
 
  /* Sorts the positions of the slices that are in the wheel by prize amount,
   * but without changing the pattern of the colors.
   */
  public void sort(){
    //Implement the sort method here
    split();
    for (int i = 0; i < 20; i++){
       if(i % 5 == 0)
            slices.add(black.remove(smallestSlicePos(black)));
       else if (i % 2 == 1)
            slices.add(red.remove(smallestSlicePos(red)));
       else
            slices.add(blue.remove(smallestSlicePos(blue)));
    }
  }
   
  //HELPER METHODS - NOT REQUIRED BUT USEFUL
  
  //Splits the slices list into the three different colors.
  public void split() {
    
    if (slices.size() != 0){
       for(int i = 19; i >= 0; i--){
         if(i % 5 == 0)
         black.add(slices.get(i));
         else if (i % 2 == 1)
         red.add(slices.get(i));
         else
         blue.add(slices.get(i));
       }
    }
    slices.clear();
  }
  
  // Wipes the entire first 20 of the slices ArrayList for reassembly.
  public void clear() {
    for(int i = slices.size() - 1; i>= 0; i--) {
      slices.remove(i);
    }
  }
  
  // Helper method that finds the position the slice with the smallest prize in an arrayList of slices
  // This method is not implemented as I chose to go with the insertion sort instead
  public int smallestSlicePos(ArrayList<Slice> list){
    int pos = 0;
    Slice smallest = list.get(0);
    for (int i = 1; i < list.size(); i++){
      if (list.get(i).getPrizeAmount() < smallest.getPrizeAmount()) {
        smallest = list.get(i);
        pos = i;
      }
    }
    return pos;
  }
  
  // Helper method that sorts a single list of slices into ascending order of prize values
  // This method is not implemented as I chose to go with the insertion sort instead
  public void sortList(ArrayList<Slice> list){
    for (int i = 0; i < list.size(); i++){
      Slice smallest = list.get(i+1);
      int pos = 0;
      
      for (int j = i+2; j < list.size(); j++){
        
        if (smallest.getPrizeAmount() > list.get(j).getPrizeAmount()){
          smallest = list.get(j);
          pos = j;
        } 
      
        if (smallest.getPrizeAmount() < list.get(i).getPrizeAmount()){
          list.set(i, list.remove(pos));
          list.add(smallest);
        }
      }
    }
  }
  

  
  /* COMPLETED METHODS - YOU DO NOT NEED TO CHANGE THESE */
 
  /* Creates a wheel with 20 preset slices
   */
  public GameWheel()
  {
    this(getStandardPrizes());
  }
 
  /* Creates a wheel with 20 slices, using values from array parameter
   */
  public GameWheel(int[] prizes)
  {
    currentPos = 0;
    slices = new ArrayList<Slice>();
    for(int i = 0; i < 20; i++){
      int pa = 0;
      String col = "blue";
      if(i < prizes.length)
        pa = prizes[i];
      if (i%5 == 0)
        col = "black";
      else if (i%2 == 1)
        col = "red";
      slices.add(new Slice(col, pa));
    }
  }
 
  /* Spins the wheel by so that a different slice is selected. Returns that
   * slice (Note: the 10 slices following the current slice are more likely to
   * be returned than the other 10).
   */
  public Slice spinWheel()
  {
    //spin power between range of 1-50 (inclusive)
    int power = (int)(Math.random()*50 + 1);
    int newPos = (currentPos + power) % slices.size();
    currentPos = newPos;
    return slices.get(currentPos);
  }
 
  public Slice getSlice(int i){
    int sliceNum = i;
    if(i < 0 || i > 19)
      sliceNum = 0;
    return slices.get(sliceNum);
  }
 
  // Makes an array with a standard list of prizes
  private static int[] getStandardPrizes()
  {
    int[] arr = new int[20];
    for (int i=0; i < 20; i++)
    {
      if (i%5 == 0)
        arr[i] = i*200;
      else if (i%2 == 1)
        arr[i] = i*10;
      else
        arr[i] = i*100;
    }
    return arr;
  }
}
