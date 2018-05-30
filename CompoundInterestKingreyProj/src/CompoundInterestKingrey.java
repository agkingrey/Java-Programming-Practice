import java.util.Scanner;

public class CompoundInterestKingrey {

	public static void main(String[] args) {
		//Scanner
		Scanner in = new Scanner(System.in);
		
		//Grab user input
		System.out.println("Please enter the base amount.");
		double principal = in.nextDouble();
		
		System.out.println("Please enter the interest rate in correct decimal format");
		double interestRate = in.nextDouble();
		
		System.out.println("Please enter the number of years.");
		double years = in.nextDouble();
		
		System.out.printf("%.2f",computeBalance(principal,interestRate,years));
		
		in.close();
	}

	public static double computeBalance(double principal, double interestRate, double time)
	{
		double balance = 0;
		balance = principal * Math.pow((1 + interestRate), time);
		return balance;
	}
}
