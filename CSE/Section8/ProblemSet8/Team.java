package Section8.ProblemSet8;
public class Team
{
    private String name;
    private int wins;
    private int losses;
    private int ties;
    private int scored;
    private int allowed;
    public Team(String name) { this.name = name; }
    public void stats() { System.out.println(name + "\nWins: " + wins + ", Losses: " + losses + ", Ties: " + ties + "\nPoints Scored: " + scored + ", Points Allowed: " + allowed + "\n"); }
    public String getName() { return name; }
    public void win() { wins++; }
    public void lose() { losses++; }
    public void tie() { ties++; }
    public void addScored(int scored) { this.scored += scored; }
    public void addAllowed(int allowed) { this.allowed += allowed; }
}