package Section4.Tip01;
import java.math.*;
public class Tip01
{
    public static void main(String[] args)
    {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        int[] totals = new int[]{ 10, 12, 9, 8, 7, 15, 11, 30 };
        for (int i = 0; i < totals.length; i++)
        {
            System.out.println("Person " + (i + 1) + ": $" + (Math.round((totals[i] * 1.2 * 10)))/10.0);
        }
    }    
}
