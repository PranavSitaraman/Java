package Section8.ProblemSet8;
import java.util.*;
public class Game implements Comparable<Game>
{
    private Team home;
    private Team away;
    private int homeScore;
    private int awayScore;
    private int temp;
    private int id;
    private static ArrayList<Game> games = new ArrayList<>();
    public Game(Team home, Team away, int temp)
    {
        this.home = home;
        this.away = away;
        this.temp = temp;
        this.id = games.size() + 1;
        games.add(this);
    }
    public int compareTo(Game other)
    {
        if (this.temp > other.temp) return 1;
        else if (this.temp < other.temp) return -1;
        return 0;
    }
    public void play()
    {
        Random rand = new Random();
        homeScore = rand.nextInt(temp/8);
        awayScore = rand.nextInt(temp/8);
        home.addScored(homeScore);
        home.addAllowed(awayScore);
        away.addScored(awayScore);
        away.addAllowed(homeScore);
        if (homeScore > awayScore) { home.win(); away.lose(); }
        else if (homeScore < awayScore) { home.lose(); away.win(); }
        else { home.tie(); away.tie(); }
    }
    public static void stats()
    {
        if (games.size() == 0) System.out.println("No games played this season.");
        else for (Game game : games) System.out.println("Game #" + game.id + "\nTemperature: " + game.temp + "\nHome Team: " + game.home.getName() + ", " + game.homeScore + "\nAway Team: " + game.away.getName() + ", " + game.awayScore + "\n");
    }
    public static void hottest()
    {
        if (games.size() == 0) System.out.println("No games played this season.");
        else System.out.println("Hottest Temp: " + Collections.max(games).temp);
    }
    public static void average()
    {
        if (games.size() == 0) System.out.println("No games played this season.");
        else System.out.println("Average Temp: " + (double) (games.stream().mapToInt(games -> games.temp).sum())/games.size());
    }
}