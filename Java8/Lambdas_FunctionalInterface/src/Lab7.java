class MyRunnable implements Runnable {
	public void run() {
		for(int i=0; i<10; i++)
			System.out.println("Thread 1");
	}
}

public class Lab7{
	public static void main(String[] args) {
		Runnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0; i<10; i++)
			System.out.println("Thread 2");
	}
}