/*
 * 
 */
package cs520.hw2.part1;

import javax.swing.JOptionPane;
import java.util.StringTokenizer;

public class StringTest {

	private static String	input,
							inputTrimmed,
							city,
							name,
							age;
	private static int		age10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = JOptionPane.showInputDialog("Please enter data using format Name,Age,City");
		//String delimiter = ",";
		//StringTokenizer st = new StringTokenizer(input, delimiter);
		
		// its not pretty but its removes the spaces on either side of the comma and on the front and back 
		inputTrimmed = input.trim().replace(", ", ",");
		inputTrimmed = inputTrimmed.replace(" ,", ",");
		
		//creates useable string array and splits on comma
		String[] inputSplit = inputTrimmed.split(",");
		
			
		//Position of words,
		int pos1 = inputTrimmed.indexOf(',');
		int pos2 = inputTrimmed.indexOf(',', pos1 + 1);
		
		//setting up substrings
		int stringLength = inputTrimmed.length();
				
		name = inputTrimmed.substring(0, (stringLength - (stringLength-pos1)));  
		age = inputTrimmed.substring(pos1, pos2).replace(",", "");
		city = inputTrimmed.substring((name.length()+age.length()+2), stringLength); //the 2 is for the expected commas
				
		age10 = Integer.parseInt(age) + 10;
		
		//console outputs
		System.out.println(inputTrimmed);
		System.out.printf("Frist Comma Position:%d, Name:%s, Length:%d \n", pos1, name, name.length() );
		System.out.printf("Second Comma Position:%d, Name:%s, Length:%d \n", pos2, age, age.length() );
		System.out.printf("you will be %d in 10 years from now!\n", age10);
		System.out.printf("City:%s, Length:%d \n", city, city.length() );
		
	}

}
