package Section7.ProblemSet7;
import java.util.*;
public class ProblemSet07
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Game game = new Game(5);
        Terminal terminal = new Terminal(new Prize("Mini Toys", 10, 3), new Prize("Candies", 20, 4), new Prize("Bouncy Balls", 30, 5));
        Card card1 = new Card();
        Card card2 = new Card();
        System.out.println("How much money (in dollars) do you want to add to Card 1?");
        terminal.addCredits(card1, in.nextInt());
        System.out.println("How much money (in dollars) do you want to add to Card 2?");
        terminal.addCredits(card2, in.nextInt());
        System.out.println("How many games do you want to play with Card 1?");
        int j = in.nextInt();
        for (int i = 0; i < j; i++) game.play(card1);
        terminal.balance(card1);
        System.out.println("How many games do you want to play with Card 2?");
        j = in.nextInt();
        for (int i = 0; i < j; i++) game.play(card2);
        terminal.balance(card2);
        System.out.println("How many credits do you want to transfer from Card 1 to Card 2? Input -1 to transfer all.");
        j = in.nextInt();
        if (j == -1) terminal.transferCredits(card1, card2);
        else terminal.transferCredits(card1, card2, j);
        System.out.println("How many tickets do you want to transfer from Card 1 to Card 2? Input -1 to transfer all.");
        j = in.nextInt();
        if (j == -1) terminal.transferTickets(card1, card2);
        else terminal.transferTickets(card1, card2, j);
        in.nextLine();
        System.out.println("Name a prize to request from Card 1:");
        terminal.requestPrize(in.nextLine(), card1);
        System.out.println("Name a prize to request from Card 2:");
        terminal.requestPrize(in.nextLine(), card2);
        System.out.println("Thank you for playing! Here is your remaining balance:");
        terminal.balance(card1);
        terminal.balance(card2);
    }
}