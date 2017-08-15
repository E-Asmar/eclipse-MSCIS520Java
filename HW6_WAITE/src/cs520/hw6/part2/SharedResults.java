package cs520.hw6.part2;

import java.util.ArrayList;
import java.util.List;

public class SharedResults {
	private ResultsEntry r;
	private int count = 0;
	private List<ResultsEntry> results = new ArrayList<>(); //passing in int value to define size of array list
	private String threadResult;
	private int turn;
	
	public void addToResults(int turn ,ResultsEntry r) {
		results.add(r);
		threadResult = r.toString();
		count = r.getCount();
		this.setCount(count);
		this.turn = turn;
		
	}
	private int cap = 0;
	public synchronized void getResults() throws InterruptedException {
		
		System.out.printf("Calling Thread's Turn %d \n", results.size());
		while(results.size() == turn) {
			wait();
			System.out.println(turn);
		}
		System.out.printf("%s is adding  %s\n",
				Thread.currentThread().getName(), threadResult);
		
		//return count;
		System.out.println("Cumulative Results are " + results);
		//System.out.println("Alphabet Count = " + count);
		notify();
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = this.count + count;
	}
}
