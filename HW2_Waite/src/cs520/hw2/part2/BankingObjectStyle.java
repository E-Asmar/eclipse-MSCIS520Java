/* Author: Patrick Waite
 * Date: 7/15/2017
 * Description: Homework Assignment #2 part 2 OOP style for the calculation of ending value of bank CD
 */

package cs520.hw2.part2;

public class BankingObjectStyle {

	public static void main(String[] args) {
	    //Initialize the new BankCD methods for Bank1CD and Bank2CD
		BankCD	bank1CD = new BankCD("BankA");
		BankCD bank2CD = new BankCD("BankB");
		
		//set our values for bank1CD
		bank1CD.setInitialDeposit(5000);
	    bank1CD.setRate(4.00);
	    bank1CD.setNumberOfYears(3);
	    
	    
	    //Set our values for bank2CD
	     bank2CD.setInitialDeposit(5000);
	     bank2CD.setRate(3.00);
	     bank2CD.setNumberOfYears(4);
	     
	    //print output for each instance
	    bank1CD.printCDDetails();
	    bank2CD.printCDDetails();
	    
	    
	    //if statement compares values for best result
	    if(bank1CD.getFinalValue() > bank2CD.getFinalValue()) 
		{
			double result = bank1CD.getFinalValue() - bank2CD.getFinalValue();
			System.out.printf("%s,'s CD exceeds %s's CD by $%.2f\n", bank1CD.getBankName(), bank2CD.getBankName(), result);
		}
		else
		{
			double result = bank2CD.getFinalValue() - bank1CD.getFinalValue();
			System.out.printf("%s,'s CD exceeds %s's CD by $%.2f\n", bank2CD.getBankName(), bank1CD.getBankName(), result);
		}
	}

}
