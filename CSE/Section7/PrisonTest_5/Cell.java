package Section7.PrisonTest_5;

import java.util.*;

public class Cell
{
    private String name;
    private boolean open;
    private String security;
    
    public String getName()
    {
        return name;
    }

    public boolean getOpen()
    {
        return open;
    }

    public Cell(String name, boolean open)
    {
 	    this.name = name;
 	    this.open = open;
        Random rand = new Random();
        security = "";
        for (int i = 0; i < 4; i++)
        {
            security += rand.nextInt(10);
        }
        System.out.println("Your security code is " + security + ". Don't lose it!");
    }

    public void display()
    {
        System.out.println("Cell " + name + " is " + (open ? "open." : "closed."));
    }

    public void openDoor()
    {
        System.out.print("Enter the security code: ");
        Scanner in = new Scanner(System.in);
        String code = in.nextLine();
        if (open && code.equals(security))
        {
            open = false;
            System.out.println("The door closes.");
        }
        else if (code.equals(security))
        {
            open = true;
            System.out.println("The door opens.");
        }
        else
        {
            System.out.println("Sorry, your code is incorrect.");
        }
    }
    public void openDoor(String code)
    {
        if (open && code.equals(security))
        {
            open = false;
            System.out.println("The door closes.");
        }
        else if (code.equals(security))
        {
            open = true;
            System.out.println("The door opens.");
        }
        else
        {
            System.out.println("Sorry, your code is incorrect.");
        }
    }
}