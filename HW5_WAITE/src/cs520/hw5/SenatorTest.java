/*Author: Patrick Waite
 * Description : homework # 5 for METCS520
 * info: working with Hashmaps and linked lists
 * 
*/
package cs520.hw5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class SenatorTest {

	private static Senator currentSenator;
	private static String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<String> senatorQueue;
		senatorQueue = new LinkedList<String>();
		
		//Map<String, Senator> senatorMap = new HashMap<>();
		Map<String, String> senatorMap = new HashMap<>();
		
		String inputFileName = "data.txt";
		FileReader fileReader = null;
		//creates the fileReader needed for bufferReader to work
		try {
			fileReader = new FileReader(inputFileName);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}

		//stripping out the data line by line 
		BufferedReader reader = new BufferedReader(fileReader);
		String input;
		try {
			input = reader.readLine();
			while (input!=null) {
				//invokes ProcessInputData to parse the data into subcomponents and reads line by line
				
				processInputData(input);
				input = reader.readLine();
	
				senatorQueue.add(input);
				int comma = input.indexOf(",");
				String key = input.substring(0, comma);
			
				senatorMap.put(key, input);
			}
			System.out.println(senatorMap);
		}catch (IOException e) {
			e.printStackTrace();

		}catch(NoSuchElementException e) {
			System.out.println("white space and empty lines in data.txt");
		}
		catch(NullPointerException e)
		{
			System.out.println("");
		}
		//closes the fileReader once the bufferReader has finished its opooration. 
		try {
			fileReader.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
			Iterator<String> listIterator = senatorQueue.iterator();
			while(listIterator.hasNext()) {
				String pass = listIterator.next();
				System.out.println(pass);
				}
	
			Set<String> keys = senatorMap.keySet();
			Iterator<String> passer = keys.iterator();
			while(passer.hasNext()) {
				String pass = passer.next();
				System.out.println(pass + ": " + senatorMap.get(pass));
			}
				
	}
	private static Senator processInputData(String input)
	{
		Senator currentSenator = new Senator(name);
		
		String[] data = input.split(",");
		
		String name = data[0];
		String years = data[1];
		String party = data[2];
		String state = data[3];
		
		currentSenator.setName(name);
		currentSenator.setYearsInOffice(years);
		currentSenator.setParty(party);
		currentSenator.setState(state);

		return currentSenator;
	}


}
