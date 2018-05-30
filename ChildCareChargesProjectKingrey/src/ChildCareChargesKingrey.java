import java.util.Scanner;

public class ChildCareChargesKingrey {

	public static void main(String[] args) {
		int rates[][] = {      {30, 60, 88, 115, 140},
                			   {26, 52, 70, 96, 120},                 
                			   {24, 46, 67, 89, 110},
                               {22, 40, 60, 75, 88},
                               {20, 35, 50, 66, 84} };
		
		//scanner in and user input
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Please enter your child's age or '999' to exit.");
		int age = in.nextInt();
		
		while(age != 999) //sentinel of 999
		{
			in.nextLine();
			System.out.println("Please enter how many days per week your child will be attending.");
			int days = in.nextInt();
			
			//set the total cost using the 2d array
			int totalCost = rates[age][days-1];
			
			//print back to the user
			System.out.println("The rate for childcare is " + totalCost);
			
			in.nextLine();
			System.out.println("Please enter your child's age or '999' to exit.");
			age = in.nextInt();
		}
	}

}
