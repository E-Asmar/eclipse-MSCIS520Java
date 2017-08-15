package cs520.hw6.part2;

public class ResultsEntry {
	private int count;
	private char target;
	public ResultsEntry(char target, int count) {
		
		this.setCount(count);
		this.setTarget(target);
		
		this.getCount();
		this.getTarget();
		
	}
	@Override
	public String toString() {
		return "<"+ target + "," + count+">";
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public char getTarget() {
		return target;
	}
	public void setTarget(char target) {
		this.target = target;
	}
	
}
