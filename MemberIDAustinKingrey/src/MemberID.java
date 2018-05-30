//Austin Kingrey
import java.util.Scanner;
public class MemberID {

	public static void main(String[] args) {
		
		//First I will receive the user input and force it all to upper case
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please Enter the user ID: ");
		String memberID = in.next();
		memberID = memberID.toUpperCase();
		
		//Now I'll be using charAT to separate all of the 14 letters of the string
		char first = memberID.charAt(0);
		
		char second = memberID.charAt(1);
		
		char third = memberID.charAt(2);
		
		char fourth = memberID.charAt(3);
		
		char fifth = memberID.charAt(4);
		
		char sixth = memberID.charAt(5);
		
		char seventh = memberID.charAt(6);
		
		char eighth = memberID.charAt(7);
		
		char ninth = memberID.charAt(8);
		
		char tenth = memberID.charAt(9);
		
		char eleventh = memberID.charAt(10);
		
		char twelth = memberID.charAt(11);
		
		char thirteenth = memberID.charAt(12);
		
		char fourteenth = memberID.charAt(13);
		
		//Time to correctly print the results!
		
		System.out.print(first);
		System.out.print("-");
		System.out.print(second);
		System.out.print(third);
		System.out.print(fourth);
		System.out.print(" ");
		System.out.print(fifth);
		System.out.print(sixth);
		System.out.print(seventh);
		System.out.print(eighth);
		System.out.print(" ");
		System.out.print(ninth);
		System.out.print(tenth);
		System.out.print("-");
		System.out.print(eleventh);
		System.out.print(twelth);
		System.out.print(thirteenth);
		System.out.print(" (");
		System.out.print(fourteenth);
		System.out.print(")");
		
		
		
		in.close();
	}

}
