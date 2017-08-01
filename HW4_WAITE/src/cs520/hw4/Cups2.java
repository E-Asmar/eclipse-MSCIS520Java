/* Author: Patrick Waite
 * Discription: homework assignment 4
 * cupstacking 
 */

package cs520.hw4;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Cups2 extends JFrame {
	private int startX,		//left most point
				workingX,	//to help with placement of cups in stack
				startY,		//top most point
				workingY,	//to help with placement of cups in stack
				cupWidth,	//width of cup
				cupHeight,	//height of cup
				baseLength, //number of cups on bottom row
				cupSpaceing; //spaces between cups

		
	//constructor
	public Cups2() {
	//set the window tile with the super method
	super("Waite");
	startX=100;
	startY=300;
	cupWidth = 25;
	cupHeight = 40;
	baseLength = 7; 
	cupSpaceing = 6;
	
	}
	
	//viewport (paint method)
	public void paint(Graphics g) {
	//working x and y to keep start x and y separate this will become important when placing new rows on the pyramid 
	workingX = startX; 
	workingY = startY;
	
	//first for loop or rows
	for (int row = baseLength; row >= 1; row--) {
	//setting the color of the cups to alternating rows
	if(row%2 == 1) {
		g.setColor(Color.red);
	}else {
		g.setColor(Color.blue);
	}
	//creates each cup image in the row as a 'column'
	for(int col = 0; col < row; col++) {
		int xpoints[] = { (workingX+5), workingX, (workingX+cupWidth), (workingX+cupWidth-5), workingX};
	    int ypoints[] = {workingY, (workingY+cupHeight), (workingY+cupHeight),   workingY, workingY};
	    int npoints = 5;
		
	    g.fillPolygon(xpoints, ypoints, npoints);
		
		//g.fillRect(workingX, workingY, cupWidth, cupHeight);
		//sets the x value for the next cup to be added
		workingX = workingX + cupWidth + cupSpaceing;
		
	}
	//sets the y value for the next row
	workingY = workingY - cupHeight;
	//sets the offset for the row to make the pyramid shape
	startX = startX + ((cupWidth + cupSpaceing)/2);
	//sets workingX to the new startX value for the pattern
	workingX = startX;
	//g.setColor(Color.red);
	}
	}
	
	//main method
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	//sets width and height of JFrame
	int width = 550;
	int height = 550;
	
	//call the constructor 
	Cups2 cups = new Cups2();		
	
	//set view pane size
	cups.setSize(width, height);
	
	//set visibility 
	cups.setVisible(true);
	
	//set close on exit
	cups.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
		
}
