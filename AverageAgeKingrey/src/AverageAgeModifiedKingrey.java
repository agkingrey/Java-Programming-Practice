import java.util.Scanner;
public class AverageAgeModifiedKingrey {
	public static void main (String [] args){
		//Scanner in and variable declaration
		Scanner in = new Scanner(System.in);
		int counter = 0;
		int runningTotal = 0;
		
		//Grabbing the user input for number of ages
		System.out.println("How many ages would you like to enter?: ");
		int numOfAges = in.nextInt();
		
		//While loop adds 1 to counter every time and will stop one it reaches numOfAges
		while(counter < numOfAges)
		{
			//Grabbing user input
			System.out.println("Enter an age: ");
			int age = in.nextInt();
			
			runningTotal += age;
			counter++;
		}
		
		//Now we are going to do the math for the average
		double averageAge = runningTotal/numOfAges;
		
		//Print and close
		System.out.println("The average age is: " + averageAge);
		
		in.close();
	}
}
