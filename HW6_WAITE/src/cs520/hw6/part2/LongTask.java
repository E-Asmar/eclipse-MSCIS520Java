package cs520.hw6.part2;

public class LongTask extends Thread {
	private ResultsEntry result;
	private SharedResults sharedData;
	private StringBuffer inputData;
	private char target;
	private String name;
	private int turn;
	
	public LongTask(int turn, SharedResults sharedData, StringBuffer inputData, char target) {
		super("Thread_"+target);
		this.name = "Thread_" + target;
		this.sharedData = sharedData;
		this.inputData = inputData;
		this.target = target;
		this.turn = turn;
		
	}
	public void run()
	{
		System.out.printf("Thread %s - Turn %d \n", name, turn);
		int count = 0;
		
				
		for (int i = 0; i < inputData.length(); i++)
		{
			if(inputData.charAt(i) == target)
			{
				count++;
			}
		}
		result = new ResultsEntry(target, count);
		//ResultsEntry result = new ResultsEntry(target, count);
		//SharedResults sharedData = new SharedResults();
		try {
			sharedData.addToResults(turn, result);
			sharedData.getResults();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;
	}
}
