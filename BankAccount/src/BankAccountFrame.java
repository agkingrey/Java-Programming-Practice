import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BankAccountFrame extends JFrame{
	BankAccount account;
	private JLabel amount = new JLabel();
	private JTextField userInput = new JTextField(15);
	private JButton deposit = new JButton();
	private JButton withdrawal = new JButton();
	private JLabel balance = new JLabel();
	
	public BankAccountFrame(BankAccount b)
	{
		 //set some text for my buttons
		amount.setText("PLease enter in how much you are going to deposit or withraw");
		deposit.setText("DEPOSIT");
		withdrawal.setText("WITHDRAW");
		
		//set account object to b
		account = b;
		
		//add deposit listener
		depositListener d = new depositListener();
		deposit.addActionListener(d);
		
		//add withd. listener
		withdrawalListener w = new withdrawalListener();
		withdrawal.addActionListener(w);
		
		//create a jpanel and add all componenets to it
		JPanel controlPanel = new JPanel();
		controlPanel.add(amount);
		controlPanel.add(userInput);
		controlPanel.add(deposit);
		controlPanel.add(withdrawal);
		controlPanel.add(balance);
		
		add(controlPanel);
		setSize(400,150);
	}
	
	class depositListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			//get the amount in the text box and parse it
			String a = userInput.getText();
			double depositAmount = Double.parseDouble(a);
			
			//perform the deposit method and update the balance
			BankAccount.deposit(depositAmount);
			balance.setText("Balance =" + account.getBalance());
			
			
		}
		
	}
	
	class withdrawalListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			//get the am0ount in the text box and parse
			String a = userInput.getText();
			double withdrawalAmount = Double.parseDouble(a);
			
			//perform the withrawal method and update the balance
			BankAccount.withdraw(withdrawalAmount);
			balance.setText("Balance =" + account.getBalance());
			
		}
		
	}

}
