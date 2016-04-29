class MyThread extends Thread{

	public void start(){
		// super.start();
		System.out.println("start().....");
	}

	public void run(){
		System.out.println("MyThread running run()......");
	}
}

class ThreadDemo {
	public static void main(String[] args) {
	
		MyThread t = new MyThread();
		t.start();

	/*	Thread t1 = new Thread(t);
		t1.start();
	*/	
		System.out.println("main Thread");
	}

}