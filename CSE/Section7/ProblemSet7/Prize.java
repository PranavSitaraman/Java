package Section7.ProblemSet7;
import java.util.*;
public class Prize
{
    private String name;
    private int tickets;
    private int count;
    public Prize(String name, int tickets, int count)
    {
        this.name = name;
        this.tickets = tickets;
        this.count = count;
    }
    public String getName() { return name; }
    public int getTicketsRequired() { return tickets; }
    public int getCount() { return count; }
    public void setCount(int count) { this.count = count; }
}