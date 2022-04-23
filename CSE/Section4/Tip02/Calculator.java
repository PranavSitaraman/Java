package Section4.Tip02;
public class Calculator
{
    public double tax = .05;
    public double tip = .15;  //Change tax and tip if you prefer different values
    public double originalPrice = 0;
    public void findTotal()
    {
        //Calculate an individual's total after tax and tip
        //Print this value
        System.out.println(Math.round(originalPrice * (1 + tax + tip) * 10)/10.0);
    }
}
