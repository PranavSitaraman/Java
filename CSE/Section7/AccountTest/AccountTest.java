package Section7.AccountTest;

public class AccountTest
{
	public static void main(String[] args)
	{
		CheckingAccount account = new CheckingAccount("Pranav", 51.43);
		System.out.println(account.getBalance());
		account.withdraw(33);
		SavingsBond bond = new SavingsBond("Pranav", 50, 5);
		bond.monthPasses();
		bond.monthPasses();
		bond.monthPasses();
		bond.monthPasses();
		bond.monthPasses();
	}
}