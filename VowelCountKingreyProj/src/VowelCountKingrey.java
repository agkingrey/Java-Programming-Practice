import java.util.Scanner;

public class VowelCountKingrey {

	public static void main(String[] args) {
		//First to declare my vowel count variable
		int vowelCount = 0;
		
		// grab user input
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a word in all lower case");
		String userString = in.next();
		
		//For loop running through each letter checking for a vowel
		for(int i =0; i < userString.length(); i++)
		{
			String sub = userString.substring(i, i+1);
			
			if(sub.equals("a"))
			{
				vowelCount++;
			}
			if(sub.equals("e"))
			{
				vowelCount++;
			}
			if(sub.equals("i"))
			{
				vowelCount++;
			}
			if(sub.equals("o"))
			{
				vowelCount++;
			}
			if(sub.equals("u"))
			{
				vowelCount++;
			}	
		}
		
		//if statement whether my vowel count caught any vowels, then repeating for y vowels
		if (vowelCount < 1)
		{
			for(int i =0; i < userString.length(); i++)
			{
				String sub = userString.substring(i, i + 1);
				
				if(sub.equals("y"))
				{
					vowelCount++;
				}
			}
		}
		//repeating one last check to see if i have any vowels now
		if(vowelCount < 1)
			System.out.println("You must have a spelling mistake somewhere");
		
		
		//Printing the number of vowels to the user
		else
		{
			System.out.println("There are " +vowelCount+ " vowel(s) in your word.");
		}
		in.close();
	}

}
