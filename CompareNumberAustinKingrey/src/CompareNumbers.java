//Austin Kingrey
import java.util.Scanner;
public class CompareNumbers {

	public static void main(String[] args) {
		
		//First I Will receive the user input
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double numberOne = in.nextDouble();
		
		System.out.print("Enter another number: ");
		double numberTwo = in.nextDouble();
		
		//Time to test whether the numbers are equal less or greater using booleans
		boolean greaterThan = numberOne > numberTwo;
		boolean lessThan = numberOne < numberTwo;
		boolean equal = numberOne == numberTwo;
		
		//I will now print the results out for the user
		System.out.print(numberOne);
		System.out.print(" is equal to ");
		System.out.print(numberTwo);
		System.out.print(": ");
		System.out.println(equal);
		
		System.out.print(numberOne);
		System.out.print(" is greater than ");
		System.out.print(numberTwo);
		System.out.print(": ");
		System.out.println(greaterThan);
		
		System.out.print(numberOne);
		System.out.print(" is less than ");
		System.out.print(numberTwo);
		System.out.print(": ");
		System.out.println(lessThan);

		in.close();
	}

}
