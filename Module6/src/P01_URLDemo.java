import java.net.*;
import java.io.*;
import javax.swing.*;

public class P01_URLDemo {
	
	public static void main(String[] args) {
		String page = "http://norvig.com/big.txt";
		URL urlObject = null;
		
		try {
			urlObject = new URL(page);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		System.out.printf("Protocol (%s), Host(%s)\n", 
							urlObject.getProtocol(),
							urlObject.getHost());
		System.out.printf("Port (%s), default port (%s)", 
							urlObject.getPort(),
							urlObject.getFile());
		System.out.printf("path (%s) query (%s) file (%s)", 
							urlObject.getPath(),
							urlObject.getQuery(),
							urlObject.getFile());
		//read data
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
		/*JFrame frame = new JFrame(page);
		JTextArea ta = new JTextArea(buffer.toString());
		ta.setVisible(true);
		JScrollPane sp = new JScrollPane(ta);
		
		frame.getContentPane().add(sp);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
		//System.out.print(buffer.toString());
		char a = 'a';
		countOccurance(buffer, a);
		System.out.println(count);
	}
	public static int countOccurance(StringBuffer sb, char ch) {
		int count = 0;
		for (int i = 0; i < sb.length(); i++)
		{
			if(sb.charAt(i) == ch)
			{
				count++;
			}
		}
		return count;
	}
}


