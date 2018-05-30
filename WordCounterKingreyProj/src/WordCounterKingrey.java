import java.util.Scanner;

public class WordCounterKingrey {

	public static void main(String[] args) {
		//Scanner
		Scanner in = new Scanner(System.in);
		
		//Grab user input
		System.out.println("Please enter a phrase");
		String userPhrase = in.nextLine();
		
		
		in.close();
		
		System.out.println(countWords(userPhrase));
	}
	public static int countWords(String str)
	{
		int wordCount = 1;
		for(int i = 0; i <str.length(); i++)
		{
			String sub = str.substring(i,i+1);
			
			if(sub.equals(" "))
			{
				wordCount++;
			}
		}
		return wordCount;
	}
}
