/*Author: Patrick Waite
 *Description: METCS 520 O1 -- Assignment 1, Part 1
 *using conversion rate to switch currency around.*/

package cs520.hw1.part1;

//imports to get keyboard scanner for user imputs
import java.util.Scanner;

//import javax.swing.JTextField;

public class Demonetize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create new scanner object
		Scanner input = new Scanner(System.in);
		//create User Input field
		//JTextField userInput = new JTextField(30);
				
				
		//set variables and data type
		int input1,
			input2,
			input3,
			newTwoThousand,
			remainderInFive,
			newFiveHundred;
		
		//requests # of thousand demoniation bills
		System.out.println("Please enter the number of old 1000 demoniation notes you wish to exchange: " );
		//Sets the variable thousandBills to the user input
		input1 = input.nextInt();		
		//requests # of 500 demonomition bills
		System.out.println("Please enter the number of old 500 demoniation notes you wish to exchange: " );
		//set variable input
		input2 = input.nextInt();
		
		//test input/output
		System.out.println("Entered # of thousand demominations: " + input1 + " totalling out to: " + (input1 * 1000));
		System.out.println("Entered # of five hundred denominaiton: " + input2 + " totalling out to: " + (input2 * 500));
		System.out.println();
		
		input3 = ((input1*1000)+(input2*500));
		
		System.out.println("Total amount to be Exchanged: " + input3);
		
		newTwoThousand = (input3/2000);
		remainderInFive = (input3%2000);
		newFiveHundred = (remainderInFive/500);
		
		System.out.println("Number of New Two Thousand Notes: " + newTwoThousand);
		//System.out.println(remainderInFive);
		System.out.println("Number of New Five Hundred Notes:  " + newFiveHundred);
	}

}
