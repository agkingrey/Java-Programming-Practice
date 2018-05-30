import java.util.Scanner;

public class MadLibs {
	public static void main(String[] args) {
		
		//First I will grab the user input by storing 6 strings and then making the appropriate
		// strings lower case
		Scanner in = new Scanner(System.in);
		
		//Here importantly I use the substring to capitilize the first letter and forcing the rest to lower case
		//Yay extra credit!!!!
		System.out.println("Enter a name: ");
		String name = in.next();
		name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
		
		System.out.println("Enter an object: ");
		String objectOne = in.next();
		objectOne = objectOne.toLowerCase();
		
		System.out.println("Enter an object: ");
		String objectTwo = in.next();
		objectTwo = objectTwo.toLowerCase();
		
		System.out.println("Enter an object: ");
		String objectThree = in.next();
		objectThree = objectThree.toLowerCase();
		
		System.out.println("Enter a past tense verb: ");
		String verb = in.next();
		verb = verb.toLowerCase();
		
		System.out.println("Enter an adjective: ");
		String adjective = in.next();
		adjective = adjective.toLowerCase();
		
		System.out.println("-----------------------------");
		
		//Now that I have all of the user input stored, its time to build the story
		
		System.out.print(name);
		System.out.println(" was a huge " +objectOne);
		System.out.print("The " +objectTwo);
		System.out.print(" was " +adjective);
		System.out.println(" as cheese");
		System.out.print("And everywhere that "+name);
		System.out.println(" " +verb);
		System.out.print("The "+objectThree);
		System.out.println(" was sure to go");
		
		
		
		
		
		
		
		
		
		
		
		
		
		in.close();
	}
}
