import java.util.Scanner;

public class VowelFoundKingrey {

	public static void main(String[] args) {
		//Declare the variables
		String userString="";
		
		// scanner in
		Scanner in = new Scanner(System.in);
		
		
		
		//while loop until user enters exit
		
		while(!userString.equals("exit"))
		{
			//Ask up here but collect below
			System.out.println("Please enter a word in all lower case or 'exit'");
			
		
		// For loop running through each letter checking for a vowel
		for (int i = 0; i < userString.length(); i++) 
		{
			String sub = userString.substring(i, i + 1);

			if (sub.equals("a")) 
			{
				System.out.println("A vowel has been found!");
				break;
			}
			if (sub.equals("e")) 
			{
				System.out.println("A vowel has been found!");
				break;
			}
			if (sub.equals("i")) 
			{
				System.out.println("A vowel has been found!");
				break;
			}
			if (sub.equals("o")) 
			{
				System.out.println("A vowel has been found!");
				break;
			}
			if (sub.equals("u")) 
			{
				System.out.println("A vowel has been found!");
				break;
			}
			
		}
		//I moved userString down here because otherwise it prints vowel has been found before exiting
		userString = in.next();
		}
		
		in.close();
	}
}
