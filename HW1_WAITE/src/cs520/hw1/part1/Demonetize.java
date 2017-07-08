//Author: Patrick Waite
//Description: METCS 520 O1 -- Assignment 1, Part 1
//	using conversion rate to switch currency around.

package cs520.hw1.part1;

//imports to get keyboard scanner for user imputs
import java.util.Scanner;

public class Demonetize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create new scanner object
		Scanner input = new Scanner(System.in);
		//set variables type
		int thousandBills, 
			fiveHundredBills;
		
		//requests # of thousand demoniation bills
		System.out.println("Please enter the number of 1000 demoniation bills you wish to exchange: " );
		//Sets the variable thousandBills to the user input
		thousandBills = input.nextInt();		
		//requests # of 500 demonomition bills
		System.out.println("Please enter the number of 500 demoniation bills you wish to exchange: " );
		//set variable input
		fiveHundredBills = input.nextInt();
		
		//test input/output
		System.out.println("Entered # of thousand demominations: " + thousandBills + " totalling out to: " + (thousandBills * 1000));
		System.out.println("Entered # of five hundred denominaiton: " + fiveHundredBills + " totalling out to: " + (fiveHundredBills * 500));
		
		
		
	}

}
