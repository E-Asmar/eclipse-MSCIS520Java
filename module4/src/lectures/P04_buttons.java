package lectures;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class P04_buttons extends JFrame 
	implements ActionListener
{
	private JButton clickButton;
	private int count = 0;
	
	//constructor
	public P04_buttons()
	{
		super("button click demo");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		clickButton = new JButton("Click me!");
		clickButton.setBackground(Color.ORANGE);
		clickButton.addActionListener(this);
		
		c.add(clickButton);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.red);
		g.setFont(new Font("Times", Font.BOLD, 22));
		//display count
		g.drawString("You've clicked me " + count + " times.", 30, 100);
	}
	public void actionPerformed(ActionEvent e) {
		count ++;
		
		repaint();
	}
	
	public static void main(String[] args)
	{
		P04_buttons app = new P04_buttons();
		app.setSize(350,200);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}
