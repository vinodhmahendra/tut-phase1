package threads;

public class MyRunnable implements Runnable{
	
	public void run() {
		System.out.println("Hello from  thread "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		MyRunnable target = new MyRunnable();
		Thread t1 = new Thread(target);
		Thread t2 = new Thread(target);
		
		try {
			t1.join();
			t2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Threads have finished executing.");
	}

}
