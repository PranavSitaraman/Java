package Section7.ProblemSet7;
import java.util.*;
public class Terminal
{
    private Prize prize1;
    private Prize prize2;
    private Prize prize3;
    public Terminal(Prize prize1, Prize prize2, Prize prize3)
    {
        this.prize1 = prize1;
        this.prize2 = prize2;
        this.prize3 = prize3;
        System.out.println("Successfully created a terminal with " + prize1.getCount() + " " + prize1.getName() + " that require " + prize1.getTicketsRequired() + " tickets each, " + prize2.getCount() + " " + prize2.getName() + " that require " + prize2.getTicketsRequired() + " tickets each, and " + prize3.getCount() + " " + prize3.getName() + " that require " + prize3.getTicketsRequired() + " tickets each!");
    }
    public void addCredits(Card card, int money)
    {
        if (money < 0) System.out.println("Cannot add negative amount to Card #" + card.getNumber() + "!");
        else
        {
            card.setCredits(card.getCredits() + 2 * money);
            System.out.println("Successfully added " + (2 * money) + " credits to Card #" + card.getNumber() + "!");
        }
    }
    public void balance(Card card)
    {
        System.out.println("Card #" + card.getNumber() + ": " + card.getCredits() + " credits! " + card.getTickets() + " tickets!");
    }
    public void transferCredits(Card give, Card receive) { transferCredits(give, receive, give.getCredits()); }
    public void transferTickets(Card give, Card receive) { transferTickets(give, receive, give.getTickets()); }
    public void transferCredits(Card give, Card receive, int credits)
    {
        if (credits < 0) System.out.println("Cannot transfer negative number of credits from Card #" + give.getNumber() + " to Card #" + receive.getNumber() + "!");
        else if (give.getCredits() < credits) System.out.println("Not enough credits on Card #" + give.getNumber() + "!");
        else
        {
            receive.setCredits(receive.getCredits() + credits);
            give.setCredits(give.getCredits() - credits);
            System.out.println("Transfer " + credits + " credits from Card #" + give.getNumber() + " to Card #" + receive.getNumber() + "!");
            balance(give);
            balance(receive);
        }
    }
    public void transferTickets(Card give, Card receive, int tickets)
    {
        if (tickets < 0) System.out.println("Cannot transfer negative number of tickets from Card #" + give.getNumber() + " to Card #" + receive.getNumber() + "!");
        else if (give.getTickets() < tickets) System.out.println("Not enough tickets on Card #" + give.getNumber() + "!");
        else
        {
            receive.setTickets(receive.getTickets() + tickets);
            give.setTickets(give.getTickets() - tickets);
            System.out.println("Transfer " + tickets + " tickets from Card #" + give.getNumber() + " to Card #" + receive.getNumber() + "!");
            balance(give);
            balance(receive);
        }
    }
    public void requestPrize(String name, Card card)
    {
        if (name.equals(prize1.getName())) vend(prize1, card);
        else if (name.equals(prize2.getName())) vend(prize2, card);
        else if (name.equalsIgnoreCase(prize3.getName())) vend(prize3, card);
        else System.out.println("Error: no item category " + name + "!");
    }
    private void vend(Prize prize, Card card)
    {
        if (card.getTickets() < prize.getTicketsRequired()) System.out.println("Not enough tickets on Card #" + card.getNumber() + "! " + prize.getName() + " require " + prize.getTicketsRequired() + " tickets!");
        else if (prize.getCount() <= 0) System.out.println("No more " + prize.getName() + " remain. This prize is gone.");
        else
        {
            prize.setCount(prize.getCount() - 1);
            card.setTickets(card.getTickets() - prize.getTicketsRequired());
            System.out.println("You win " + prize.getName() + "! " + prize.getCount() + " " + prize.getName() + " remain!");
            balance(card);
        }
    }
}