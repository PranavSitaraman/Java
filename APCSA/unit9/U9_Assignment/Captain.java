package unit9.U9_Assignment;

public class Captain extends UltimatePlayer {
  
  private boolean type;
  private String actualType;
  
  public Captain(String firstName, String lastName, String position, boolean type) {
    super(firstName, lastName, position);
    this.type = type;
    
    if(type) actualType = "offense";
    else actualType = "defense";
  }

  public int throwDisc(int pow) {
        if(pow > 10) pow = 10;
        else if(pow < 1) pow = 1;
        
        return pow * 5;    
  }

  public String toString() {
    return super.toString() + "\n   Captain: " + actualType; 
  }
}
