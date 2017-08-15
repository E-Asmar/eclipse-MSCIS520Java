package cs520.hw6.part2;

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
				new LongTask(0, shared, buffer, 'a'),
				new LongTask(1, shared, buffer, 'b'),
				new LongTask(2, shared, buffer, 'c'),
				new LongTask(3, shared, buffer, 'd'),
				new LongTask(4, shared, buffer, 'e'),
				new LongTask(5, shared, buffer, 'f'),
				new LongTask(6, shared, buffer, 'g'),
				new LongTask(7, shared, buffer, 'h'),
				new LongTask(8, shared, buffer, 'i'),
				new LongTask(9, shared, buffer, 'j'),
				new LongTask(10, shared, buffer, 'k'),
				new LongTask(11, shared, buffer, 'l'),
				new LongTask(12, shared, buffer, 'm'),
				new LongTask(13, shared, buffer, 'n'),
				new LongTask(14, shared, buffer, 'o'),
				new LongTask(15, shared, buffer, 'p'),
				new LongTask(16, shared, buffer, 'q'),
				new LongTask(17, shared, buffer, 'r'),
				new LongTask(18, shared, buffer, 's'),
				new LongTask(19, shared, buffer, 't'),
				new LongTask(20, shared, buffer, 'u'),
				new LongTask(21, shared, buffer, 'v'),
				new LongTask(22, shared, buffer, 'w'),
				new LongTask(23, shared, buffer, 'x'),
				new LongTask(24, shared, buffer, 'y'),
				new LongTask(25, shared, buffer, 'z')};
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
