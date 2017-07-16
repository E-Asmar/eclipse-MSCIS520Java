/* Author: Patrick Waite
 * Date: 7/15/2017
 * Description: Homework Assignment #2 part 2 OOP method library to be used for the OOP style for the calculation of ending value of bank CD
 */

package cs520.hw2.part2;


public class BankCD {
	private String 	bankName;
	public String	output;
	private int		initialDeposit,
					numberOfYears;
	private double 	rate,
					rateDisplay,
					finalValue;

	
	//constructors
	//zero args not used but needed to satisfiy the JVM
	public BankCD() {}
	//constructor for single bank name arguments.
	public BankCD(String input) {
		this.bankName = input;
		this.rate = getRate();
		this.numberOfYears = getNumberOfYears();
		this.initialDeposit = getInitialDeposit();
	}
		
	//set methods
	public void setInitialDeposit(int initialDeposit) {
		this.initialDeposit = initialDeposit;
	}
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}
	public void setRate(double rate) {
		this.rate = rate / 100;
	}
	public void setFinalValue(double finalValue) {
		this.initialDeposit = getInitialDeposit();
		this.rate = getRate();
		this.numberOfYears = getNumberOfYears();
		
		finalValue = initialDeposit * Math.pow((1+rate),numberOfYears);
	}
		
	//get methods
	public int getInitialDeposit() {
		return initialDeposit;
	}
	public int getNumberOfYears() {
		return numberOfYears;
	}
	public double getRate() {
		return rate;
	}
	public String getBankName() {
		return bankName;
	}
		
	public double getFinalValue(){
		this.initialDeposit = getInitialDeposit();
		this.rate = getRate();
		this.numberOfYears = getNumberOfYears();
		finalValue = initialDeposit * Math.pow((1+rate),numberOfYears);
		
		return finalValue;
	}
	public String printCDDetails() {
		this.bankName = getBankName();
		this.numberOfYears = getNumberOfYears();
		this.initialDeposit = getInitialDeposit();
		this.rateDisplay = rate*100;
		this.finalValue = getFinalValue();
		//System.out.println(finalValue);
		
		System.out.printf("%s %d-year CD of $%d at %.2f%% rate is worth %.2f %n", bankName, numberOfYears, initialDeposit, rateDisplay, finalValue); 
		return null;
	}
	

}
