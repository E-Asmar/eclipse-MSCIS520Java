package cs520.hw6.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//url buffer 
		String page = "http://norvig.com/big.txt";
		URL urlObject = null;
		
		try {
			urlObject = new URL(page);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		StringBuffer buffer = new StringBuffer();
		String inputLine;
		try {
			InputStreamReader inputStream = new InputStreamReader(urlObject.openStream());
			BufferedReader reader = new BufferedReader(inputStream);
			while ((inputLine = reader.readLine()) != null) {
				buffer.append(inputLine + "\n");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.print(buffer.toString());
		//create the new SharedResults

		
	}

}
