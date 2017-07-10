
public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countDown;
		
		System.out.println("first while loop");
		countDown = 3;
		
		while (countDown > 0)
		{
			System.out.println("Hello");
			countDown = --countDown;
		}
		
		System.out.println("second while loop");
		countDown = 10;
		while(countDown > 0)
		{
			System.out.println("Hello");
			countDown = countDown - 1;
		}
		
		System.out.println("First Do-while loop");
		countDown = 8;
		do
		{
			System.out.println("hello");
			countDown = countDown - 1;
		}while (countDown > 0);
			
		
	}

}
