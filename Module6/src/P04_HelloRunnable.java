
public class P04_HelloRunnable implements Runnable {
	
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.printf("Hello %d from %s\n", i, Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable app = new P04_HelloRunnable();
		Thread t1 = new Thread(app);
		t1.start();
		Thread t2 = new Thread(app);
		t2.start();
		try {
			t1.join();
			t2.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("finishing the main...");

	}

}
