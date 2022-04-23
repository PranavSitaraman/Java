package Section7.ProblemSet7;
import java.util.*;
public class Game
{
    private int credits;
    public Game(int credits)
    {
        this.credits = credits;
        System.out.println("Successfully began the arcade game!");
    }
    public int getCredits() { return credits; }
    public void play(Card card)
    {
        Random rand = new Random();
        if (card.getCredits() >= credits)
        {
            card.setCredits(card.getCredits() - credits);
            int tickets = rand.nextInt(20) + 1;
            card.setTickets(card.getTickets() + tickets);
            System.out.println("Card #" + card.getNumber() + ": " + tickets + " tickets won! " + card.getTickets() + " tickets total!");
        }
        else System.out.println("Insufficent credits on Card #" + card.getNumber() + "!");
    }
}
