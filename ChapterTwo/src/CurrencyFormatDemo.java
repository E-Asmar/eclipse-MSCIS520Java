//Imports
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Without Formatting:");
		
		System.out.println(19.8);
		System.out.println(19.811111);
		System.out.println(19.899999);
		System.out.println(19);
		System.out.println();
		
		System.out.println("Default Locaiton:");
		NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
		
		System.out.println(moneyFormatter.format(19.8));
		System.out.println(moneyFormatter.format(19.811111));
		System.out.println(moneyFormatter.format(19.899999));
		System.out.println(moneyFormatter.format(19));
		System.out.println();
		
		System.out.println("US as Locaiton:");
		NumberFormat moneyFormatter2 = NumberFormat.getCurrencyInstance(Locale.US);
		
		System.out.println(moneyFormatter2.format(19.8));
		System.out.println(moneyFormatter2.format(19.811111));
		System.out.println(moneyFormatter2.format(19.899999));
		System.out.println(moneyFormatter2.format(19));
		
	}

}
