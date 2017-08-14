
public class P01_HelloThread extends Thread {

	public P01_HelloThread() {
		
	}
	public P01_HelloThread(String name) {
		super(name);
	}
	public void run() {
		for (int i = 1; i<= 5; i++) {
			System.out.printf("hello %d from %s\n", i, this.getName());
			Thread.yield();
			
			long milliSecs = (long) (10000 * Math.random());
			try {
				Thread.sleep(milliSecs);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new P01_HelloThread("Thread1");
		Thread t2 = new P01_HelloThread("Thread2");
		
		t1.start();
		t2.start();
	}

}
