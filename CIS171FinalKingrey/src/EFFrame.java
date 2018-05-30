// Austin Kingrey
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EFFrame extends JFrame {
	
	public EFFrame()
	{
		//simply implements a frame and add it to the panel. 
		//This allows me to use a custom jframe with my panel
		EFPanel panel = new EFPanel();
		add(panel);
	}
	
	

}
