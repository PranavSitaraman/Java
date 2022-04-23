package Section4.Tip04;
public class CalculatorTest
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        
        //Name your friends
        double total = 0;
        total += calc.findTotal(10, "Person1");
        total += calc.findTotal(12, "Person2");
        total += calc.findTotal(9,  "Person3");
        total += calc.findTotal(8,  "Person4");
        total += calc.findTotal(7,  "Person5");
        total += calc.findTotal(15, "Alex");
        total += calc.findTotal(11, "Person7");
        total += calc.findTotal(30, "Forgetful");

        //Find and print the entire table's total, including tax and tip
       System.out.println("Total: " + total);
        
    } 
}
