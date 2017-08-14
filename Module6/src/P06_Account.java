
public class P06_Account {
	private int balance = 0;
	
	public synchronized void deposit(int amount, int step) {
		balance += amount;
		System.out.printf(
				"%s (%d) deposited %d, New Balance %d\n", 
				Thread.currentThread().getName(), 
				step, 
				amount, 
				balance);
		notify();
	}
	
	//wait if the amount is less than balance
	public synchronized void withdraw(int amount, int step) {
		while(amount>balance) {
			System.out.printf(
					"%s (%d) waiting to withdraw %d (current balance %d) \n", 
					Thread.currentThread().getName(),step,
					amount, balance);
			try {
				wait();
				}catch(InterruptedException e) {
					e.printStackTrace();
					}
		}
	//balance decrement
	balance -= amount;
	System.out.printf("%s (%d) withdrew %d, new balance %d\n",
			Thread.currentThread().getName(), step, amount, balance);
	}
		
}
