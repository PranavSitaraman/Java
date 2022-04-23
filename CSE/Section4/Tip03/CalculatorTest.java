package Section4.Tip03;
public class CalculatorTest
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();

        //Use the Calculator object and arguments supplied to findTotal()
        //to print the total for each person

        int[] totals = new int[]{ 10, 12, 9, 8, 7, 15, 11, 30 };
        for (int i = 0; i < totals.length; i++)
        {
            System.out.print("Person " + (i + 1) + ": ");
            calc.findTotal(totals[i]);
        }
    }    
}
