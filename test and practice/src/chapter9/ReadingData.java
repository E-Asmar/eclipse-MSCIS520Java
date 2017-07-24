package chapter9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ReadingData {

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
				input = reader.readLine();
			}
		}catch (IOException e) {
			e.printStackTrace();
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
		String id = st.nextToken();
		String name = st.nextToken();
		String salary = st.nextToken();
		
		/*System.out.print(id);
		System.out.print(name);
		System.out.println(salary);*/
		Employee currentEmployee = new Employee(id, name, Integer.parseInt(salary));
		System.out.println(currentEmployee.displayInfo());
	}

}
