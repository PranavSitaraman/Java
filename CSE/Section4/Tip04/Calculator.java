package Section4.Tip04;
public class Calculator
{
    public double tax = .05;
    public double tip = .15;
    
    //Include the cost of Alex's and Forgetful's meals in your calculations
    //Return the total after calculating

    public double findTotal(double price, String name)
    {
        if (name.equals("Forgetful") || name.equals("Alex"))
        {
            System.out.println(name + ": $0"); 
            return 0;
        }
        else
        {
            double total = (price + (15+30)/6.0) * (1 + tax + tip);
            System.out.println(name +": $" +total);
            return total;
        }
    }
}
