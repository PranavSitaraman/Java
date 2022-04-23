package Section3;
import java.io.*;
import java.util.*;
public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        
        String shirtPrice = "5";
        String taxRate = "10";
        String gibberish = "asjfojasofjasdof";
        
        
        //Parse shirtPrice and taxRate, and print the total tax
        int price = Integer.parseInt(shirtPrice);
        int rate = Integer.parseInt(taxRate);
        System.out.println((double) price * ((double) rate)/(100.0));
        
        
        //Try to parse taxRate as an int
        //Try to parse gibberish as an int
        
    }
    
}
