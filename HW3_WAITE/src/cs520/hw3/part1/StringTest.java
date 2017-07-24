/*
 * 
 */
package cs520.hw3.part1;

import javax.swing.JOptionPane;

public class StringTest {

	private static String	input,
							inputTrimmed,
							city,
							name,
							age;
	private static int		age10,
							stringLength,
							pos1,
							pos2;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		
			input = JOptionPane.showInputDialog("Please enter data using format Name,Age,City");
			
			// its not pretty but its removes the spaces on either side of the comma and on the front and back 
			inputTrimmed = input.trim().replace(", ", ",");
			inputTrimmed = inputTrimmed.replace(" ,", ",");
				
			//Position of words,
			pos1 = inputTrimmed.indexOf(',');
			pos2 = inputTrimmed.indexOf(',', pos1 + 1);
			
			//setting up substrings
			stringLength = inputTrimmed.length();
					
			name = inputTrimmed.substring(0, (stringLength - (stringLength-pos1)));  
			age = inputTrimmed.substring(pos1, pos2).replace(",", "");
			city = inputTrimmed.substring((name.length()+age.length()+2), stringLength); //the 2 is for the expected commas
					
			age10 = Integer.parseInt(age) + 10;
			
			//console outputs
			System.out.println(inputTrimmed);
			System.out.printf("Frist Comma Position:%d, Name:%s, Length:%d \n", pos1, name, name.length() );
			System.out.printf("Second Comma Position:%d, Age:%s, Length:%d \n", pos2, age, age.length() );
			System.out.printf("you will be %d in 10 years from now!\n", age10);
			System.out.printf("City:%s, Length:%d \n", city, city.length() );
			
		}
		catch(StringIndexOutOfBoundsException e) 
		{
			System.out.println("index token (,) missing, please enter a valid input for age");
		}
		catch(NullPointerException e)
		{
			System.out.println("please enter a valid input");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number format exception, please enter a valid input (age needs to be a number)");
		}
		
	}

}