
public class Account {

	private static int balance = 0;
	
	public void deposit(int amount){
		synchronized (this) {
			balance += amount;
		}
		//more code
		
	}
	public void withdraw(int amount) {
		synchronized (this) {
			balance += amount;
		}
		//more code
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
