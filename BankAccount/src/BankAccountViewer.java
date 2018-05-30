import javax.swing.JFrame;

public class BankAccountViewer {

	public static void main(String[] args) {
		//created a bank account
		BankAccount account = new BankAccount(100);
		
		//create new jframe
		
		JFrame frame = new BankAccountFrame(account);
		
		//set default close and set visibility
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
