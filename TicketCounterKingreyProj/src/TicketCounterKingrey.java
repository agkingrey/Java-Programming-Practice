import java.util.Scanner;
public class TicketCounterKingrey {
	public static void main(String[] args){
		//Variable declaration and scanner in
		int ticketsRemaining = 75;
		int ticketsPurchased = 0;
		final int MIN_TICKETS = 1;
		final int MAX_TICKETS = 6;
		int buyers = 0;
		
		Scanner in = new Scanner(System.in);
		
		//while loop to run the program until all tickets are gone
		while (ticketsRemaining > 0)
		{
			// grabbing how many tickets the user will purchase
			
			System.out.println("How many tickets would you like to purchase?: ");
			ticketsPurchased = in.nextInt();
			
			//While loop to verify the user didn't buy too many tickets
			while (ticketsPurchased > MAX_TICKETS || ticketsPurchased < MIN_TICKETS)
			{
				System.out.println("Please enter a ticket amount between " + MIN_TICKETS + " and " + MAX_TICKETS);
				ticketsPurchased = in.nextInt();
			}
			
			//if statement to find whether enough tix are available
			while (ticketsPurchased > ticketsRemaining)
			{
				System.out.println("Only " + ticketsRemaining + " are remaining. Please enter a valid amount.");
				ticketsPurchased =in.nextInt();
			}
			
			
			//Removing the tickets from tickets remaining and adding to the buyer list
			ticketsRemaining -= ticketsPurchased;
			buyers++;
			
			//Printing the ticket purchase and remaining tickets to the user
			System.out.println("Congrats you bought " +ticketsPurchased);
			System.out.println("There are " +ticketsRemaining+ " tickets remaining.");
		 }
		
		//Print statement for how many buyers.
		System.out.println("There are " +buyers+ " buyers.");
		in.close();
	}
		
}
