/**
	Same as JoinDemo1.java, only change is t.join() after t.start() in main.
**/

class MyThread extends Thread{
	static Thread mt;

	public void run(){
		try{
			mt.join();
		}catch (Exception e) {
			System.out.println("Exception");
		}

		for(int i=0; i<10; i++)
			System.out.println("child Thread");
		
	}
}

class DeadLockDemo {
	public static void main(String[] args) throws InterruptedException{
		MyThread.mt = Thread.currentThread();
		MyThread t = new MyThread();
		t.start();
		t.join();

		for(int i=0; i<10; i++) {
			System.out.println("main Thread");
			Thread.sleep(200);
		}
				
	}
}
