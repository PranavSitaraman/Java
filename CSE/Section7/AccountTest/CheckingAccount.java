package Section7.AccountTest;

public class CheckingAccount
{
	private String name;
	private double balance;
	public CheckingAccount(String name, double balance)
	{
		this.name = name;
		this.balance = balance;
	}
	public double getBalance()
	{
		return balance;
	}
	public String getName()
	{
		return name;
	}
	public void withdraw(double withdrawal)
	{
		if (withdrawal < 0)
		{
			System.out.println("ERROR: Withdrawal amount is negative");
		}
		else if (withdrawal > balance)
		{
			System.out.println("ERROR: Balance is too low");
		}
		else
		{
			balance -= withdrawal;
			System.out.println("SUCCESS: New balance is " + balance);
		}
	}
}