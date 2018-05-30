
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EFPanel extends JPanel {
	
	//create global instance of drawing
	EFPaint paint = new EFPaint();
	
	//create the componenets needed for the panel and add them
	JLabel instructions = new JLabel("Please enter a wind speed:");
	JTextField userInput = new JTextField(10);
	JButton submit = new JButton("Submit");
	JLabel errorZone = new JLabel("");
	static String speedErrorMessage;
	static int finalSpeed;
	
	public EFPanel()
	{
		
		
		paint.setPreferredSize(new Dimension(100,200));
		
		//add clicklistener
		ClickListener l = new ClickListener();
		submit.addActionListener(l);
		
		add(instructions);
		add(userInput);
		add(submit);
		add(paint);
		add(errorZone);
	}
	
	class ClickListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try
			{
			String tempSpeed = userInput.getText();
			finalSpeed = Integer.parseInt(tempSpeed);
			}
			catch(NumberFormatException ex)
			{
				EFPanel.setSpeedErrorMessage("Wrong data type");
			}
			errorZone.setText(speedErrorMessage);
			paint.changeUI();
			
			
		}
		
	}
	
	// a getter and setter to grab the final speed from the user input along with error collection

	public static int getFinalSpeed() {
		return finalSpeed;
	}

	public void setFinalSpeed(int finalSpeed) {
		this.finalSpeed = finalSpeed;
	}

	public String getSpeedErrorMessage() {
		return speedErrorMessage;
	}

	public static void setSpeedErrorMessage(String se) {
		speedErrorMessage = se;
	}

	

}
