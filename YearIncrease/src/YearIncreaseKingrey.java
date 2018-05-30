
public class YearIncreaseKingrey {

	public static void main(String[] args) {
		// Variable declaration
		int year;
		final int START_YEAR = 2015;
		final int FACTOR = 5;
		final int END_YEAR = 2045;
		
		//need to set my year variable to start year
		year = START_YEAR;
		
		//this will print year until year is less than or equal to 2045
		while (year <= END_YEAR)
		{
			//Print
			System.out.println(year);
			
			//Add 5 years every time the loop goes through
			year += FACTOR;
		}	
	}
}
