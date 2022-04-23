package Section3;
import java.io.*;
import java.util.*;
public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        Scanner in = new Scanner(System.in);
        int eggsPerChicken = in.nextInt();
        int chickenCount = in.nextInt();
        System.out.println(((chickenCount * 2 + 1 + (chickenCount + 1)/2) * eggsPerChicken));
    }   
}
