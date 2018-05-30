import java.util.Scanner;

public class BadArrayIndexKingrey {

	public static void main(String[] args) {
		//Create string array with 10 names
		String nameArray [] = {"Austin", "Bob", "Carl", "Dan", "Earl", "Frank", "Gene", "Harold","Joe","Morgan"};
		
		Scanner in = new Scanner(System.in);
		
		try
		{
		//Grab user input
		System.out.println("Please enter a number 0-9 to see a secret name.");
		int userValue = in.nextInt();
		
		String arrayValue = nameArray [userValue];
		
		System.out.println(arrayValue);
		} catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please enter a valid value");
		}
	}

}
