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
		
		System.out.println("Input Data Lenght: " + buffer.length());
		//System.out.print(buffer.toString());
		//create the new SharedResults
		SharedResults shared = new SharedResults();
		
		Thread[] threads = new Thread[] {
				new LongTask(shared, buffer, 'a'),
				new LongTask(shared, buffer, 'b'),
				new LongTask(shared, buffer, 'c'),
				new LongTask(shared, buffer, 'd'),
				new LongTask(shared, buffer, 'e'),
				new LongTask(shared, buffer, 'f'),
				new LongTask(shared, buffer, 'g'),
				new LongTask(shared, buffer, 'h'),
				new LongTask(shared, buffer, 'i'),
				new LongTask(shared, buffer, 'j'),
				new LongTask(shared, buffer, 'k'),
				new LongTask(shared, buffer, 'l'),
				new LongTask(shared, buffer, 'm'),
				new LongTask(shared, buffer, 'n'),
				new LongTask(shared, buffer, 'o'),
				new LongTask(shared, buffer, 'p'),
				new LongTask(shared, buffer, 'q'),
				new LongTask(shared, buffer, 'r'),
				new LongTask(shared, buffer, 's'),
				new LongTask(shared, buffer, 't'),
				new LongTask(shared, buffer, 'u'),
				new LongTask(shared, buffer, 'v'),
				new LongTask(shared, buffer, 'w'),
				new LongTask(shared, buffer, 'x'),
				new LongTask(shared, buffer, 'y'),
				new LongTask(shared, buffer, 'z')};
		for(int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
		for(int i = 0; i < threads.length; i++) {
			try {
				threads[i].join();
			}catch(InterruptedException ignore) {}
		}
		System.out.println("Alphabet Count = " + shared.getCount());
		
	}

}
