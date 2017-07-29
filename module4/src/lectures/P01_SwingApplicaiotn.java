package lectures;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class P01_SwingApplicaiotn extends JFrame {
	//constructor
	public P01_SwingApplicaiotn() {
		super("Skeleton GUI Application");
		//get input values if any using dialog
	}
	
	
	public void paint(Graphics g)
	{
		//call paint method of JFrame
		super.paint(g);
		
		int x, y;
		Font originalFont, newFont;
		
		x = 20; y = 50;
		
		originalFont = g.getFont();
		g.drawString("a string in the current font", x, y);
		
		y = y +30;
		newFont = new Font("Arial", Font.PLAIN, 18);
		g.setFont(newFont);
		g.drawString("A string in Arial and Plain of size 18", x, y);
		
		y=y+30;
		newFont = new Font("Arial", Font.BOLD, 18);
		g.setFont(newFont);
		g.drawString("in bold", x, y);
		
		//draws the shape
	    Color oldColor = Color.black;
		Color newColor = Color.blue;
						
		int x1,x2,y1,y2;
		
		x1 = 20;
		y1 = 50;
		x2 = 80;
		y2 = 90;
		
		//draws a line
		g.drawLine(x1, y1, x2, y2);
		//draws a line at differnet pints
		g.drawLine(x1, y2, x2, y1);
		
		x1 = 220; y1 = 50;
		g.drawRect(x1, y1, 100, 50);
		g.drawRect(x1, y1, 75, 75);
		
		g.setColor(Color.red);
		g.drawRect(x1, y1, 220, 80);
		
		g.setColor(Color.blue);
		x1 = 220; y1 = 150;
		g.fillRect(x1, y1, 100, 50);
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P01_SwingApplicaiotn app = new P01_SwingApplicaiotn();
		//Set the size of the application window (width, height)
		
		app.setSize(500, 400);
		// Make the window visible
		
		app.setVisible(true);
		//to close the application when the x is clicked
		//on the window upper right corner
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
