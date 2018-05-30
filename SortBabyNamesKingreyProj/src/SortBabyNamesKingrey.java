import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

public class SortBabyNamesKingrey {
public static String address = "";
	public static void main(String[] args) throws IOException {
		try{
		address = "https://bbmedia.dmacc.edu/CIS/CIS171/babynames2014.txt";
		URL pageLocation = new URL(address);
		Scanner in = new Scanner(pageLocation.openStream());
		
		PrintWriter outGirl = new PrintWriter("girls.txt");
		PrintWriter outBoy = new PrintWriter("boys.txt");
		
		String value = "";
		
		while(in.hasNextLine())
		{
			value = in.nextLine();
			
			if(value.contains("girl"))
			{
				outGirl.println(value);
			}
			else if(value.contains("boy"))
			{
				outBoy.println(value);
			}
		}
		
		
	}
	catch (IOException e)
	{
		System.out.println(address +"Does not exist");
	}
	}
}
