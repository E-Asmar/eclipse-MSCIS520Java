package cs520.hw6.part1;

public class ResultsEntry {
	private int count;
	private char target;
	public ResultsEntry(int count, char target) {
		count = this.getCount();
		target = this.getTarget();
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
