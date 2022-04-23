public class TriangleNumberTracker {
  
  public int current;
  public int number;
  
  public TriangleNumberTracker(int first){
    current = first;
  }
  
  public int currentTriangle() {
    number = current * (current + 1) / 2;
    return number;
  }
  
  public void prevTriangle() {
    if(current > 1){
    current--;
      }
    }
  
  public void nextTriangle() {
    current++;
  }
  
}

/*public static void main(String[] args) {
  TriangleNumberTracker t = new TriangleNumberTracker(4);
  System.out.println(t.currentTriangle());
  t.nextTriangle();	
  System.out.println(t.currentTriangle());
} */
