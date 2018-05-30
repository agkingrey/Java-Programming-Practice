import java.util.Scanner;
public class PrintStarsKingrey {

	public static void main(String[] args) {
		// Variable declaration and scanner in
		Scanner in = new Scanner(System.in);
		int check = 0;
		
		//Grabbing user input
		System.out.println("How many rows of stars would you like printed? ");
		int userInput = in.nextInt();
		
		//do loop that will print a row of stars and then add 1 to check until check < user input
		do
		{
			//Star printer 9000
			System.out.println("****************");
			check++;
		}while (check < userInput);
		
	}

}
