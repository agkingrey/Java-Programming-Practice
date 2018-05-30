import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class StopLightPanel extends JPanel {
	
	StopLightDrawing light  = new StopLightDrawing();
	
	public StopLightPanel()
	{
		JButton changeButton = new JButton();
		changeButton.setText("   Change");
		light.setPreferredSize(new Dimension(160,260));
		
		buttonListener l = new buttonListener();
		changeButton.addActionListener(l);
		
		add(light);
		add(changeButton);
	}
	
	class buttonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			light.changeColor();
			
		}
		
	}

}
