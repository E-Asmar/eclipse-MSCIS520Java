package spendingFunds;

import javax.swing.JOptionPane;
public class Income {

	private double 	salary,
					paycheck,
					hourly,
					hours,
					taxrate;
	private String paycheckValue;

	public Income() {
		/*paycheckValue = JOptionPane.showInputDialog("please enter paycheck amount");
		
		System.out.println(this.getPaycheck());*/
		
		this.getPaycheck();
		
	}
	
	public static void main(String arg0) {
		Income alpha = new Income();
		System.out.println(alpha.getPaycheck());
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getPaycheck() {
		return paycheck;
	}

	public void setPaycheck(String paycheckValue) {
		this.paycheck = Double.parseDouble(paycheckValue);
	}

	public double getHourly() {
		return hourly;
	}

	public void setHourly(double hourly) {
		this.hourly = hourly;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getTaxrate() {
		return taxrate;
	}

	public void setTaxrate(double taxrate) {
		this.taxrate = taxrate;
	}
	
	

	
	
}
