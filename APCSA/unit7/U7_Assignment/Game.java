package unit7.U7_Assignment;

public class Game
{
  public static void play(GameWheel g)
  {
    // Implement the play method here
    int total = 0;
    int check = 1;
    int spin = 0;
    String output = "";
    Slice[] gameSpin = {g.spinWheel(), g.spinWheel(), g.spinWheel()};
    
    for(int i = 0; i < gameSpin.length; i++) {
      total += gameSpin[i].getPrizeAmount();
      spin = i + 1;
      output += "Spin " + spin + " - " + gameSpin[i].toString() + "\n";
      
      if(i >= 1) {
        if(gameSpin[i - 1].getColor().equals(gameSpin[i].getColor()))
        check++;
      }
    }
  
  if(check == 3) {
  total *= 2;
  
  System.out.println("Total prize money: $" + total + "\n\n");
  System.out.println(output);
  System.out.println("Three " + gameSpin[1].getColor() + "s = double your money!");
  }
  
  else {
  System.out.println("Total prize money: $" + total + "\n\n");
  System.out.println(output);
    }
  }
}
