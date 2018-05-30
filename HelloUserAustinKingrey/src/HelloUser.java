import javax.swing.JOptionPane;

//Austin Kingrey
public class HelloUser {

	public static void main(String[] args) {
		
		//First I will get the users name and age making the name capitalized correctly
		
		String name = JOptionPane.showInputDialog("Enter your name: ");
		name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
		
		String age = JOptionPane.showInputDialog("Enter your age: ");
		
		//First I need to convert the age to a double and then add one to it
		int ageConv = Integer.parseInt(age);
		
		ageConv +=1;
		
		//Time to print the message out!
		JOptionPane.showMessageDialog(null, "Howdy, " + name + " Next year you will be " + ageConv + " years old.");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
