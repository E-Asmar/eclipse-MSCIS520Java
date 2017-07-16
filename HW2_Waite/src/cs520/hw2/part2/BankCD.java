package cs520.hw2.part2;

import java.io.PrintStream;

//import javax.swing.JOptionPane;

public class BankCD {
	private String 	bankName,
					//inputRate;
					output;
	private int		initialDeposit,
					numberOfYears;
	private double 	rate,
					//rateInput,
					finalValue;
	
	public BankCD(String bankName) {
		//this.getFinalValue();
		//return printCDDetails();
		this.printCDDetails();
	}
	public String setCDDetails(){
		output = System.out.printf("\n%s %d-year CD of $%.2f at %.2f%% rate is worth $%.2f", getBankName(), getNumberOfYears(), getInitialDeposit(), getRate(), getFinalValue());
		
	}
	
	//set methods
	public void setBankName(String bankName) {
		bankName = bankName ;		
	}
	public void setInitialDeposit(int initialDeposit) {
		initialDeposit = 5000;
	}
	public void setNumberOfYears(int numberOfYears) {
		if(bankName == "BankA") {
			numberOfYears = 3;
		}else {
			numberOfYears = 4;
		}
	}
	public void setRate(double rate) {
		if(bankName == "BankA") {
			rate = .04;
		}else {
			rate = .03;
		}
	}
	public void setFinalValue(double finalValue) {
		finalValue = getInitialDeposit() * Math.pow((1+getRate()),getNumberOfYears());
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
		return finalValue;
	}
	public String printCDDetails() {
		return output;
	}
	
	/*public static array userInput(String arg[]) {
		bankName = JOptionPane.showInputDialog("Please enter your Banking Institution");
		inputRate = JOptionPane.showInputDialog("please enter your bank's CD APR return rate");
	}*/

}
