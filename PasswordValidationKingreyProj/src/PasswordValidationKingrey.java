import java.util.Scanner;

public class PasswordValidationKingrey {

	public static void main(String[] args) {
		// Scanner in
		Scanner in = new Scanner(System.in);

		boolean passCheck1 = false;
		boolean passCheck2 = false;
		String password1 = " ";
		String password2 = "  ";
		
		//until the two passwords equal each other were running through this loop
		while (!(password1.equals(password2))) 
		{
			//until it passes the check we will keep reprompting
			while (passCheck1 == false) 
			{
				// Grab the first password and run it through the check
				System.out.println("Please enter your new password");
				password1 = in.nextLine();

				passCheck1 = passwordCheck(password1);
			}

			while (passCheck2 == false) 
			{
				// Grab the second password and run it through
				System.out.println("Success! Please enter again to confirm");
				password2 = in.nextLine();

				passCheck2 = passwordCheck(password2);
			}
			
			//if they don't equal send this message
			if(!(password1.equals(password2)))	
			{
				System.out.println("Passwords don't match try again, please retry:");
				password2 = in.nextLine();
			}
			//success!
			if(password1.equals(password2))
			{
				System.out.println("Password changed");
				break;
			}

		}

	}

	/*
	 * @param str which is a password from the user
	 * 
	 * @return whether the password is valid or not
	 */
	public static boolean passwordCheck(String str) 
	{
		// Boolean values for all the things i need to check
		boolean lengthCheck = false;
		boolean upperCaseCheck = false;
		boolean lowerCaseCheck = false;
		boolean digitCheck = false;

		// runs through each character looking for 3 of my checks
		for (int i = 0; i < str.length(); i++) 
		{
			char sub = str.charAt(i);

			if (Character.isUpperCase(sub)) 
			{
				upperCaseCheck = true;
			}
			if (Character.isLowerCase(sub)) 
			{
				lowerCaseCheck = true;
			}
			if (Character.isDigit(sub)) 
			{
				digitCheck = true;
			}
		}

		// checking length of the password
		if (str.length() == 8) 
		{
			lengthCheck = true;
		}

		// if all checks are met return true, anything else return false
		if (lengthCheck == true && upperCaseCheck == true && lowerCaseCheck == true && digitCheck == true) 
		{
			return true;
		} else 
		{
			System.out.println("Your password did not meet the criteria");
			return false;
		}
	}
}
