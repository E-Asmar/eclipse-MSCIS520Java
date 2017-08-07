package cs520.hw5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedList;

public class SenatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> senatorQueue;
		senatorQueue = new LinkedList<String>();
		
		HashMap<String, Object> senatorMap = new HashMap<String, Object>();
		
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
		
	}

}
