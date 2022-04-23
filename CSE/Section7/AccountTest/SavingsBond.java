package Section7.AccountTest;

public class SavingsBond
{
	private String name;
	private double balance;
	private int term;
	private int monthsRemaining;
	private double interestRate;
	public SavingsBond(String name, double balance, int term)
	{
		this.name = name;
		this.balance = balance;
		this.term = term;
		this.monthsRemaining = term;
		if (term == 60) term--;
		this.interestRate = (term/12 + 1) * 0.5;
	}
	public void monthPasses()
	{
		balance *= (1 + interestRate/100.0);
		monthsRemaining--;
		if (monthsRemaining == 0)
		{
			matured();
		}
	}
	private void matured()
	{
		System.out.println("Your bond has matured. Your balance is " + balance);
	}
}