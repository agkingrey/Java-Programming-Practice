//Austin Kingrey
public class ArraySearch {

	public static void main(String[] args) {
		//First I need to set up my array to search through
		int[] exArray = {15 , 22, 12, 13, 26, 9, 3, 28, 30};
		
		//This is my variable I'm searching for
		int key = 12;
		
		//Now I'll set up my "i" variable for my for loop.
		int i = 0;
		//I need to setup the result of my for loop I'm looking for
		boolean variableFound = false;
		
		for(i=0; i < exArray.length; i++) {
			//This is my nested if statement in my for my loop, testing to see if the number was found
			if (exArray[i] == key){
				variableFound = true;
			}
		}
		//Now I need to display whether I found the variable to the user!
		if (variableFound){
			System.out.println("Yes, we did find " + key + " at index " + i + "!");
		}
		else {
			System.out.println("Sorry, " + key + " is not in the array");
		}
		
		

	}

}
