/* Author: Patrick Waite
 * Date: 7/15/2017
 * Description: Homework Assignment #2 part 1 Procedural style for the calculation of ending value of bank CD
 */

package cs520.hw2.part1;

public class BankingProceduralStyle {

	public static void main(String[] args) {
		String	bankA = "BankA",
				bankB = "BankB";
		int 	bankATime = 3,
				bankBTime = 4;// number of years invested
		double 	bankARate = 0.04,
				bankARatePercent = 4.00,
				bankBRate = 0.03,
				bankBRatePercent = 3.00,
				initDeposit = 5000.00,
				result,
				bankAFinal,
				bankBFinal;
		
		bankAFinal = initDeposit * Math.pow((1+bankARate),bankATime);
		bankBFinal = initDeposit * Math.pow((1+bankBRate),bankBTime);
		
		System.out.printf("BankA %d-year CD of $%.2f at %.2f%% rate is worth $%.2f",bankATime, initDeposit, bankARatePercent, bankAFinal);
		System.out.printf("\nBankB %d-year CD of $%.2f at %.2f%% rate is worth $%.2f",bankBTime, initDeposit, bankBRatePercent, bankBFinal);
		
		if(bankAFinal > bankBFinal) 
		{
			result = bankAFinal - bankBFinal;
			System.out.printf("\n%s,'s CD exceeds %s's CD by $%.2f", bankA, bankB, result);
		}
		else
		{
			result = bankBFinal - bankAFinal;
			System.out.printf("\n%s,'s CD exceeds %s's CD by $%.2f", bankB, bankA, result);
		}
		
		
		
	}

}
