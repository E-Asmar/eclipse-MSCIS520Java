/*Author: Patrick Waite
 *Description: METCS 520 O1 -- Assignment 1, Part 1
 *using conversion rate to switch currency around.*/

package cs520.hw1.part1;

//imports to get keyboard scanner for user imputs
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Demonetize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create new scanner object
				
		//set variables and data type
		int thousands,
			fiveHundreds,
			input3,
			newTwoThousand,
			remainderInFive,
			newFiveHundred;

		String 	input1,
				input2;
			
		
		//requests # of thousand demoniation bills
	
		input1 = JOptionPane.showInputDialog("Please enter the number of old 1000 demoniation notes you wish to exchange:");
		thousands = Integer.parseInt(input1);
				
		//String thousands = Integer.toString(input1);
		
		//requests # of 500 demonomition bills
				
		input2 = JOptionPane.showInputDialog("Please enter the number of old 1000 demoniation notes you wish to exchange:");
		fiveHundreds = Integer.parseInt(input2);
		
		//String fiveHundreds = Integer.toString(input2);
		
		//test input/output
		System.out.println("Entered # of thousand demominations: " + input1 + " totalling out to: " + (thousands * 1000));
		System.out.println("Entered # of five hundred denominaiton: " + input2 + " totalling out to: " + (fiveHundreds * 500));
		System.out.println();
		
		input3 = ((thousands*1000)+(fiveHundreds*500));
		
		System.out.println("Total amount to be Exchanged: " + input3);
		System.out.println();
		
		newTwoThousand = (input3/2000);
		remainderInFive = (input3%2000);
		newFiveHundred = (remainderInFive/500);
				
		System.out.println("After new two thousand notes, " + remainderInFive + " remaining");
		System.out.println();
		
		System.out.println("Number of New Two Thousand Notes: " + newTwoThousand);
		//System.out.println(remainderInFive);
		System.out.println("Number of New Five Hundred Notes:  " + newFiveHundred);
		
		//results panel
		JOptionPane.showMessageDialog(
				null, "Total amount to be Exchanged: " + input3 + "\nNumber of New Two Thousand Notes: " + newTwoThousand + "\nNumber of New Five Hundred Notes: " + newFiveHundred);
		
		
	}

}
