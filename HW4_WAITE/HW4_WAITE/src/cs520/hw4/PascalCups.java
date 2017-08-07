package cs520.hw4;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class PascalCups extends JFrame {
	
	private int [][] data;
	private int startX,		//left most point
				workingX,	//to help with placement of cups in stack
				startY,		//top most point
				workingY,	//to help with placement of cups in stack
				cupWidth,	//width of cup
				cupHeight,	//height of cup
				baseLength, //number of cups on bottom row
				cupSpaceing; //spaces between cups
	
	public PascalCups() {
		super("Waite");
		String input = JOptionPane.showInputDialog("enter number of rows");
		int n = Integer.parseInt(input);
		data = createDataArray(n);
		startX=100;
		startY=300;
		cupWidth = 25;
		cupHeight = 40;
		baseLength = 7; 
		cupSpaceing = 6;
				
	}
	private int[][] createDataArray(int n){
		int [][] values = new int[n][];
		for (int row = 0; row < n; row++)
		{
			values[row] = new int[row + 1];
			values[row][0] = 1;
			values[row][row] = 1;
			for(int col = 1; col < row; col++)
			{
				values[row][col] = values[row-1][col-1] + values[row-1][col];
			}
		}
		return values;
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		
		workingX = startX; 
		workingY = startY;
		
		for(int row = 0; row < data.length; row++)
		{
			for(int col = 0; col < data[row].length; col++)
			{
				workingX = startX + col * 30;
				g.fillRect(workingX, workingY, cupWidth, cupHeight);
				g.drawString(Integer.toString(data[row][col]), workingX, workingY);
			}
			startX-= 15;
			workingY += 20;
		}
		
		
	}
	public static void main(String[] args) {
		PascalCups app = new PascalCups();
		app.setSize(550,550);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
