package Section7.Project;
import java.util.*;
import java.lang.Math;
public class TicTacToe
{
    // runner function
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while (true)
        {
            System.out.print("\nEnter \'p\' to play against the computer, \'t\' to run a performance test, or \'q\' to quit: ");
            String choice = in.nextLine();
            if (choice.equals("p")) Game.play(); // plays against the computer
            else if (choice.equals("t")) Game.testing(); // runs a performance test
            else break;
        }
    }
}