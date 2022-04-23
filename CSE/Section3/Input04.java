package Section3;

import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Input04
{
    public static void main(String[] args)
    {
        try
        {
            File file = new File("C:/Users/Pranav Sitaraman/Documents/Programming/Java/CSE/Section3/input04text.txt");
            Scanner sc = new Scanner(file);      
        
            int xPosition;
            int yPosition;
            
            //Edit these lines to advance the scanner
            while (true)
            {
                if (sc.findInLine("BlueBumper") != null)
                {
                    xPosition = sc.nextInt();
                    yPosition = sc.nextInt();
                    break;
                }
                sc.nextLine();
            }
        
        
            System.out.println("X: " + xPosition + ", Y: " + yPosition);
            sc.close();
        }
        catch (FileNotFoundException ex)  
        {
            System.out.println("File not found");
            // insert code to run when exception occurs
        }
    }    
}
