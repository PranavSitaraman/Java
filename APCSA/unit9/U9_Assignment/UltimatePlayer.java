package unit9.U9_Assignment;

public class UltimatePlayer extends Person {
  
  private static int jerseyNumberCounter = 0;
  private int jerseyNumber;
  private String position;
  
  public UltimatePlayer(String firstName, String lastName, String position) {
    super(firstName, lastName);
    
    if("cutter".equals(position) || "handler".equals(position))
    this.position = position;
    else this.position = "handler";
    
    this.jerseyNumberCounter++;
    this.jerseyNumber = jerseyNumberCounter;
  }

  public String getPosition() {
    return position;
  }

  public int throwDisc(int pow) {
        if(pow > 10) pow = 10;
        else if(pow < 1) pow = 1;
        
        return pow * 4;    
  }

  public String toString() {
    return super.toString() + "\n   Jersey #: " + this.jerseyNumber + "\n   Position: " + this.position; 
  }
}
