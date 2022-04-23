import java.util.Scanner;
import java.util.ArrayList;

public class U7_L1_Activity_One{

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

System.out.println(list.size());
System.out.println(list);

if(list.size() > 2) {
  list.remove(0);
  list.remove(list.size() - 1);
}

System.out.println(list);

}
}
