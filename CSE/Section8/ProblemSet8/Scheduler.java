package Section8.ProblemSet8;
import java.util.*;
public class Scheduler
{
    private Team[] teams;
    private ArrayList<Integer> previous = new ArrayList<Integer>();
    public static final int freezing = 32;
    public Scheduler(Team[] teams) { this.teams = teams; }
    public boolean schedule(int temp)
    {
        Random rand = new Random();
        if (temp > freezing)
        {
            ArrayList<Integer> remaining = new ArrayList<>();
            for (int i = 0; i < teams.length; i++) remaining.add(i);
            while (remaining.size() > 1)
            {
                Team home = teams[remaining.remove(rand.nextInt(remaining.size()))];
                Team away = teams[remaining.remove(rand.nextInt(remaining.size()))];
                Game game = new Game(home, away, temp);
                game.play();
            }
        }
        else System.out.println("Too cold to play.");
        previous.add(temp);
        if (previous.size() < 3) return true;
        for (int i = previous.size() - 3; i < previous.size(); i++) if (previous.get(i) > freezing) return true;
        return false;
    }
    public void stats() { for (Team team : teams) team.stats(); }
}