package threads;

public class MyThread extends Thread{
	
	
	public void run() {
		System.out.println("Hello From Thread " +  this.getName());
	}
	
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Threads have finished executing!");
	}

}
