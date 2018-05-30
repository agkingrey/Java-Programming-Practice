//Austin Kingrey
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class EFPaint extends JComponent {
	
	//wind speeds for my if statement
	int EF0 = 65;
	int EF1 = 86;
	int EF2 = 111;
	int EF3 = 136;
	int EF4 = 166;
	int EF5 = 200;
	
	//colors for my if statements
	Color F1 = new Color(0f,0f,0f,0f);
	Color F2 = new Color(0f,0f,0f,0f);
	Color F3 = new Color(0f,0f,0f,0f);
	Color F4 = new Color(0f,0f,0f,0f);
	Color F5 = new Color(0f,0f,0f,0f);
	
	//add paint component
	public void paintComponent(Graphics g)
	{
		//draw out the original triangle
		g.setColor(Color.black);
		g.drawPolygon(new int[] {0,50,100}, new int[] {0,150,0}, 3);
		
		//set colors for the other levels of triangles
		g.setColor(F1);
		g.fillPolygon(new int[] {40,50,60}, new int[] {120,150,120} ,3);
		
		g.setColor(F2);
		g.fillPolygon(new int[] {30,50,70}, new int[] {90,150,90} ,3);
		
		g.setColor(F3);
		g.fillPolygon(new int[] {20,50,80}, new int[] {60,150,60} ,3);
		
		g.setColor(F4);
		g.fillPolygon(new int[] {10,50,90}, new int[] {30,150,30} ,3);
		
		g.setColor(F5);
		g.fillPolygon(new int[] {0,50,100}, new int[] {0,150,0} ,3);

		
	}
	
	//method to grab the user input and change the ui accordingly
	public void changeUI()
	{
		if(EFPanel.getFinalSpeed() >= EF5 )
		{
			F5 = Color.blue;
		}
		else if(EFPanel.getFinalSpeed() >= EF4)
		{
			F4 = Color.blue;
		}
		else if(EFPanel.getFinalSpeed() >= EF3)
		{
			F3 = Color.blue;
		}
		else if(EFPanel.getFinalSpeed() >= EF2)
		{
			F2 = Color.blue;
		}
		else if(EFPanel.getFinalSpeed() >= EF1)
		{
			F1 = Color.blue;
		}
		else if(EFPanel.getFinalSpeed() <= EF0)
		{
			EFPanel.setSpeedErrorMessage("Too low of speed"); 
		}
		repaint();
	}
	
	
	

}
