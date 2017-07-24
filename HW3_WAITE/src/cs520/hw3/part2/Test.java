/*Author: Patrick Waite
 * Description: Homework 3 
 * Class METCS 520 
 */

package cs520.hw3.part2;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputFileName = "data.txt";
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(inputFileName);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		BufferedReader reader = new BufferedReader(fileReader);
		String input;
		try {
			input = reader.readLine();
			while (input!=null) {
				processInputData(input);
				input = reader.readLine(); //.replace(", ", ",").replace(" ,", ",") .trim();
			}
		}catch (IOException e) {
			e.printStackTrace();

		}catch(NoSuchElementException e) {
			System.out.println("Please remove arrent white space and empty lines in data.txt");
		}
		catch(NullPointerException e)
		{
			System.out.println("please enter a valid input");
		}
		try {
			fileReader.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private static void processInputData(String data)
	{
		
		StringTokenizer st = new StringTokenizer(data, ",");
		String name = st.nextToken();
		Senator currentSenator = new Senator(name);
		String years = st.nextToken();
		currentSenator.setYearsInOffice(years);
		String party = st.nextToken();
		currentSenator.setParty(party);
		String state = st.nextToken();
		currentSenator.setState(state);
							
		System.out.println(currentSenator.toString());
	}

}
