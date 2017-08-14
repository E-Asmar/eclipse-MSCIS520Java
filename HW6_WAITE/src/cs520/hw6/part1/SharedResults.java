package cs520.hw6.part1;

import java.util.ArrayList;
import java.util.List;

public class SharedResults {
	public ArrayList results;
	
	
	public SharedResults() {
		List<ResultsEntry> results = new ArrayList<>(); //passing in int value to define size of array list
		results.add(addToResults());
		
	}
	public ResultsEntry addToResults() {
		//results.add(addToResults());
		System.out.printf("Thread - %s , %d\n",
				Thread.currentThread().getName(), results);
		
	}
}
