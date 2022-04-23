import java.util.Scanner;
import java.util.ArrayList;

public class U7_L2_Activity_One{

  public static void main(String[] args){
    /* write your code here */
  Scanner scan = new Scanner(System.in);
  boolean run = true;
  String command = "";
  ArrayList<String> list = new ArrayList<String>();
  
  System.out.println("Please enter words, enter STOP to stop the loop.");
  while(run) { 
  command = scan.nextLine();
  
  if(command.equals("STOP")) {
    run = false;
  }
  else
  list.add(command);
  }

System.out.println("\n" + list);

for (int i = list.size() - 1; i >= 0; i--)
{
  System.out.println(list.get(i));
} 

}
}
