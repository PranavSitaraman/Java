package Section3;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class JavaLibs
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Subway!");
        System.out.println("What is your name?");
        String name = in.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.println("Would you like to order a sub today?");
        String choice = in.nextLine();
        if (choice.toLowerCase().equals("no"))
        {
            System.out.println("Have a nice day then!");
            return;
        }
        System.out.println("What size sub would you like? Enter the number in inches between 1 and 12.");
        int length = Integer.parseInt(in.nextLine());
        System.out.println("Do you want your bread toasted? Enter true if yes and false if no.");
        boolean toasted = (in.nextLine().toLowerCase().equals("true")) ? true : false;
        System.out.println("What type of cheese do you want? Options are pepper-jack, American, cheddar, and provolone.");
        String cheese = in.nextLine();
        System.out.println("How many veggies do you want in your sub?");
        int numVeg = Integer.parseInt(in.nextLine());
        ArrayList<String> veggies = new ArrayList<String>();
        for (int i = 0; i < numVeg; i++)
        {
            System.out.println("Enter the next veggie:");
            veggies.add(in.nextLine());
        }
        System.out.println("What condiment do you want? Options are ketchup, mayo, mustard, and ranch.");
        String condiment = in.nextLine();
        System.out.println("What is the tax rate in your state?");
        double taxrate = Double.parseDouble(in.nextLine());
        double cost = (double)(int)(((double) (length + numVeg) * 0.5 * (1.0 + (double) taxrate/100.0)) * 100.0)/100.0;
        System.out.println("Here is your order, " + name + ".");
        System.out.println("You ordered a " + length + "-inch sub that was" +  (toasted ? " " : " not ") + "toasted.");
        System.out.print("Your sub has " + cheese + " cheese");
        for (int i = 0; i < numVeg; i++)
        {
            if (i == numVeg - 1) System.out.print(", and " + veggies.get(i));
            else System.out.print(", " + veggies.get(i));
        }
        System.out.println(".");
        System.out.println("The cost of your sub based on its length, number of veggies, and the taxrate is $" + cost + ".");
        System.out.println("How much money do you have?");
        double money = in.nextDouble();
        if (money < cost) System.out.println("You do not have enough money to pay for your sub.");
        else System.out.println("Your change is $" + (money - cost) + ".");
    }
}