package Section4.Tip02;
public class CalculatorTest
{
    public static void main(String[] args)
    { 
        //Instantiate a Calculator object
        Calculator calcTax = new Calculator(); 
        //Access the Calculator object's fields and methods
        //to find the total for each member of the birthday party
        int[] totals = new int[]{ 10, 12, 9, 8, 7, 15, 11, 30 };
        for (int i = 0; i < totals.length; i++)
        {
            System.out.print("Person " + (i + 1) + ": $");
            calcTax.originalPrice = totals[i];
            calcTax.findTotal();
        }
    }
}