package Section7.ProblemSet7;
import java.util.*;
public class Card
{
    private int credits;
    private int tickets;
    private static int cards = 1; 
    private int number;
    public Card()
    {
        number = cards++;
        System.out.println("Successfully created Card #" + number + "!");
    }
    public int getCredits() { return credits; }
    public int getTickets() { return tickets; }
    public int getNumber() { return number; }
    public void setCredits(int credits) { this.credits = credits; }
    public void setTickets(int tickets) { this.tickets = tickets; }
}