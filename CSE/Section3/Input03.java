package Section3;
import java.io.*;
import java.util.*;
public class Input03
{
    public static void main(String[] args)
    {
        //Create a Scanner
        Scanner in = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println((a + b + c));
        //Remember to close the Scanner
        //in.close();
    }
}