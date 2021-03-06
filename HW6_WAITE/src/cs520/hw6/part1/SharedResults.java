package cs520.hw6.part1;

import java.util.ArrayList;
import java.util.List;

public class SharedResults {
	private ResultsEntry r;
	private int count = 0;
	private List<ResultsEntry> results = new ArrayList<>(); //passing in int value to define size of array list
	private String threadResult;
	
	public void addToResults(ResultsEntry r) {
		results.add(r);
		threadResult = r.toString();
		count = r.getCount();
		this.setCount(count);
		
	}
	public synchronized void getResults() {
		System.out.printf("%s is adding  %s\n",
				Thread.currentThread().getName(), threadResult);
		
		//return count;
		System.out.println("Cumulative Results are " + results);
		//System.out.println("Alphabet Count = " + count);
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = this.count + count;
	}
}
