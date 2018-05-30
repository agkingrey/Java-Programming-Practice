
public class BankAccount {
	private static double balance;
	
	public BankAccount(double b)
	{
		balance = b;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public static void deposit(double dAmount)
	{
		balance += dAmount;
	}
	
	public static void withdraw(double wAmount)
	{
		balance -= wAmount;
	}

}
