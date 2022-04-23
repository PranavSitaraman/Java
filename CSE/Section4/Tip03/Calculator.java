package Section4.Tip03;
public class Calculator {
    public double tax = .05;
    public double tip = .15;
    public void findTotal(double price)
    {
        double total = price*(1+tax+tip);
        System.out.println("$" +total);
    }
}
