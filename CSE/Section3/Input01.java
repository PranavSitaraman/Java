package Section3;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
public class Input01
{
    public static void main(String[] args)
    {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        //Parse the input as an int.
        //Print its value +1
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        System.out.println((Integer.parseInt((String)JOptionPane.showInputDialog(null, "Enter an integer: ", "Title", 2, null, null, "Type something here.")) + 1));
    }
}
