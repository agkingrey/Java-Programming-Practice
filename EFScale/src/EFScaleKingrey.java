//Austin Kingrey
import java.util.Scanner;
public class EFScaleKingrey {

	public static void main(String[] args) {
		// First assign some variables
		final int EF_RATING0 = 65;
		final int EF_RATING1 = 86;
		final int EF_RATING2 = 111;
		final int EF_RATING3 = 165;
		final int EF_RATING4 = 166;
		final int EF_RATING5 = 200;
		
		//Ask for user input
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the mph of your 3 second recording:");
		//input validation
		if (in.hasNextInt())
		{
		int windSpeed = in.nextInt();
		
		//input validation
		if (windSpeed >65)
		{
			
		
		//if else statement
		if(windSpeed >= EF_RATING0)
		{
			System.out.println("EF rating 0");
		}
		else if(windSpeed >= EF_RATING1)
		{
			System.out.println("EF rating 1");
		}
		else if(windSpeed >= EF_RATING2)
		{
			System.out.println("EF rating 2");
		}
		else if(windSpeed >= EF_RATING3)
		{
			System.out.println("EF rating 3");
		}
		else if(windSpeed >= EF_RATING4)
		{
			System.out.println("EF rating 4");
		}
		else if(windSpeed >= EF_RATING5)
		{
			System.out.println("EF rating 5");
		}
		}
		else
		{
			System.out.println("That's one wimpy tornado!");
			
		}
		}
		else
		{
			System.out.println("That is not a number silly goose");
		}
		in.close();
	}

}
