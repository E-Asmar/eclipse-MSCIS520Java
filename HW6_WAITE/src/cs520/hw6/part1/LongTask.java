package cs520.hw6.part1;

public class LongTask extends Thread {
	private ResultsEntry result;
	private SharedResults sharedData;
	private StringBuffer inputData;
	private char target;
	private String name;
	
	public LongTask(SharedResults sharedData, StringBuffer inputData, char target) {
		super("Thread_"+target);
		this.name = "Thread_" + target;
		this.sharedData = sharedData;
		this.inputData = inputData;
		this.target = target;
		
		
	}
	public void run()
	{
		System.out.printf("Thread %s running \n", name);
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
		sharedData.addToResults(result);
		sharedData.getResults();
	}
}
