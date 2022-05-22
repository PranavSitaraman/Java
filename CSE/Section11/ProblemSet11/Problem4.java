public int getFactorial()
{
	int factorial = 1;
	for (i = num; num > 0; i--)
	{
		factorial *= num;
	}
	return factorial;
}
public String toString()
{
	String out = "Factorial: " + num + "! = ";
	for (int i = 1; i < num; i++)
	{
		out += i + " * ";
	}
	out += num + " = " + getFactorial();
	return out;
}