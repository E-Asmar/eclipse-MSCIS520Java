package cs520.hw4;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Cups1 extends JFrame {
	private int startX,		//left most point
				workingX,	//to help with placement of cups in stack
				startY,		//top most point
				workingY,	//to help with placement of cups in stack
				cupWidth,	//width of cup
				cupHeight,	//height of cup
				baseLength,
				base,		 //number of cups on bottom row
				cupSpaceing; //spaces between cups

	
	//constructor
	public Cups1() {
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
		base = baseLength;
		
		//first for loop or rows
		int row = base;
		while ( row >= 1) {
			//setting the color of the cups to alternating rows
			if(row%2 == 1) {
				g.setColor(Color.red);
			}else {
				g.setColor(Color.blue);
			}
			//creates each cup image in the row as a 'column'
			for(int col = 0; col < row; col++) {
				
				g.fillRect(workingX, workingY, cupWidth, cupHeight);
				//sets the x value for the next cup to be added
				workingX = workingX + cupWidth + cupSpaceing;
				if(row <= 0) break;
				
			}
			row--;
			if(row <= 0) break;
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
		Cups1 cups = new Cups1();		
		
		//set view pane size
		cups.setSize(width, height);
		
		//set visibility 
		cups.setVisible(true);
		
		//set close on exit
		cups.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
