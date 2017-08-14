
public class P09_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create object and share with 2 threads
		P06_Account jointAccount = new P06_Account();
		P07_Producer p = new P07_Producer(jointAccount);
		P08_Consumer c = new P08_Consumer(jointAccount);
		
		p.start();
		c.start();		
	}

}
