import java.util.Random;

public class ThatsSoRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomGenerator = new Random();
		int n = 9;
		int r = randomGenerator.nextInt();
		int t = randomGenerator.nextInt(n);
		int y = randomGenerator.nextInt(3) + 4;
		double p = randomGenerator.nextDouble();
		
		int counter = 1;
		while (counter <= 5)
		{
			System.out.print("Flip number " + counter + ": ");
			int coinFlip = randomGenerator.nextInt(2);
			if(coinFlip == 1)
				System.out.println("Heads");
			else
				System.out.println("Tails");
			counter++;
		}
		
	}

}
