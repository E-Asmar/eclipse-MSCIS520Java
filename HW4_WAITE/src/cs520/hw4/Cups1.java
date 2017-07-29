package cs520.hw4;

import java.awt.Graphics;

import javax.swing.JFrame;

public class Cups1 extends JFrame {
	private int startX, 	//left most point
				startY, 	//top most point
				cupWidth,	//width of cup
				cupHeight,	//height of cup
				baseLength, //number of cups on bottom row
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
		/*for(int i = 0; i <= baseLenght; i++) {
			for 
		}*/
		
	}
	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
