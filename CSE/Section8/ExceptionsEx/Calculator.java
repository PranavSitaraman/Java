package Section8.ExceptionsEx;
public class Calculator
{
    public int add (int x, int y)
    {
        return x + y;
    }
    public double divide(int x, int y) throws ArithmeticException
    {
        return x / y;
    }
}