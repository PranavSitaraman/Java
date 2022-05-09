package Section8.ProblemSet8;
import java.util.*;
public class ProblemSet8
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Team[] teams = { new Team("Real Madrid"), new Team("Liverpool"), new Team("Manchester City"), new Team("Chelsea")};
        Scheduler scheduler = new Scheduler(teams);
        boolean next = true;
        while (next)
        {
            System.out.print("Enter today's temperature: ");
            try { next = scheduler.schedule(Integer.parseInt(in.nextLine())); }
            catch(NumberFormatException e) { System.out.print("Bad temperature value. "); }
        }
        System.out.println("Season is over\n\n*********RESULTS*********\n");
        scheduler.stats();
        Game.stats();
        Game.hottest();
        Game.average();
    }    
}