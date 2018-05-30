
public class TowersOfHanoiKingrey {
	public static void main(String[] args) {
		//Here I call my method in main
		System.out.println("tower(5, 'S', 'D', 'A')");
		tower(5, 'S', 'D', 'A');
	}
	//Here I'll build my method to send to main using these 4 variables
	public static void tower(int numberOfDisks, char sourceRod, char destRod,
			char auxRod) {
		//if n = 0 then we're done
		if (numberOfDisks == 0) {
			return;
		}
		
		//This is my variable to hold my amount of disks 
		int x = numberOfDisks - 1;
		
		//This will print my first move
		System.out.println("tower("+x+", "+sourceRod+", "+auxRod+", "+destRod+")");tower(numberOfDisks - 1, sourceRod, auxRod, destRod);
		//Second
		System.out.println("Move the disk " + numberOfDisks + " from " + sourceRod+ " to " + destRod);
		//Third
		System.out.println("tower("+x+", "+auxRod+", "+destRod+", "+sourceRod+")");tower(numberOfDisks - 1, auxRod, destRod, sourceRod);		
	}
}
