class MyThread implements Runnable {

	public void run(){
		for(int i=1; i<=10; i++)
			System.out.println("MyThread running run()......"+i);
		// Thread.yield();
	}
}

class ThreadDemo1 {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t1 = new Thread();
		Thread t2 = new Thread(mt);

		// t1.start();
		t2.start();
		// mt.start();
		mt.run();

		t2.stop();
		// mt.stop();
		
		for(int i=1; i<=10; i++)
			System.out.println("main Thread......"+i);
	
	}

}