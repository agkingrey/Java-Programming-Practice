import java.util.Scanner;

public class RandomNumbersKingrey {

	public static void main(String[] args) {
		// declare variables and grab user input
		
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers would you like to generate: ");
		int amountOfRandoms = in.nextInt();
		
		System.out.println("Minimum number: ");
		int minNumber = in.nextInt();
		
		System.out.println("Maximum number: ");
		int maxNumber = in.nextInt();
		
		for(int i = 1; i <= amountOfRandoms; i++)
		{
			double x = Math.random();
			int xNew = (int)(x*10);
			xNew = Math.max(xNew, minNumber);
			xNew = Math.min(xNew, maxNumber);
			System.out.println(xNew);
		}

	}

}
