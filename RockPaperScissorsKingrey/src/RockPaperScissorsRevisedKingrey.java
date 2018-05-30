//AustinKingrey
import java.util.Scanner;

public class RockPaperScissorsRevisedKingrey {
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
		
		switch (user1Decision)
		{
		case rock: 
		{
		
			switch (user2Decision)
			{
			case paper: 
			{
				
			}
			}
		}
		}
		
	}	
}
