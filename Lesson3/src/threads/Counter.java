package threads;

public class Counter {
	private int count;
	
	public synchronized void increment() {
		count ++;
	}
	
	public synchronized void decrement() {
		count --;
	}

	public synchronized int getCount() {
		return count;
	}
}
