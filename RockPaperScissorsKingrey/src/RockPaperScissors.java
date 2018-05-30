//Austin Kingrey
import java.util.Scanner;
public class RockPaperScissors {

	public static void main(String[] args) {
		// Assigning variables
		String rock = "Rock";
		String paper = "Paper";
		String scissors = "Scissors";
		
		
		
		//Getting user input
		Scanner in = new Scanner(System.in);
		
		System.out.println("Player 1: Pick Rock, Paper, or Scissors");
		String user1Decision = in.next();
		
		System.out.println("Player 2: Pick Rock, Paper, or Scissors");
		String user2Decision = in.next();
		in.nextLine();
		
		//Use first if statement for if user 1 picks rock
		if (user1Decision.equalsIgnoreCase(rock))
		{
			//Use a nested if else loop for whether user 2 chooses r,p,s
			if (user2Decision.equalsIgnoreCase(rock))
			{
				System.out.println("It's a tie: Boo that stinks :(");
			}
			else if(user2Decision.equalsIgnoreCase(paper))
			{
				System.out.println("You win player 2!");
			}
			else if(user2Decision.equalsIgnoreCase(scissors))
			{
				System.out.println("You win player 1");
			}
			else 
			{
				System.out.println("Not a valid input");
			}
		}
		//Same for paper
		else if (user1Decision.equalsIgnoreCase(paper))
		{
			//Use a nested if else loop for whether user 2 chooses r,p,s
			if (user2Decision.equalsIgnoreCase(rock))
			{
				System.out.println("You win player 1");
			}
			else if(user2Decision.equalsIgnoreCase(paper))
			{
				System.out.println("It's a tie: Boo that stinks :(");
			}
			else if(user2Decision.equalsIgnoreCase(scissors))
			{
				System.out.println("You win player 2");
			}
			else 
			{
				System.out.println("Not a valid input");
			}
		}
		//Same for scissors
		else if (user1Decision.equalsIgnoreCase(scissors))
		{
			//Use a nested if else loop for whether user 2 chooses r,p,s
			if (user2Decision.equalsIgnoreCase(rock))
			{
				System.out.println("You win player 2");
			}
			else if(user2Decision.equalsIgnoreCase(paper))
			{
				System.out.println("You win player 1");
			}
			else if(user2Decision.equalsIgnoreCase(scissors))
			{
				System.out.println("It's a tie: Boo that stinks :(");
			}
			else 
			{
				System.out.println("Not a valid input");
			}
		
			
		}
		else 
		{
			System.out.println("Not a valid input");
		}
			in.nextLine();
			in.close();
	}

}
