package gt1;

class UselessThread implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}


public class Test3 {
	public static void main(String[] args) {
		UselessThread t = new UselessThread();
		Thread t1 = new Thread(t);
		t1.setName("i am useless thread");
		t1.start();
	}
}
