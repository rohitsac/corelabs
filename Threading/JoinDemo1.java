/**
	waiting of child Thread until main is completed.
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

class JoinDemo1 {
	public static void main(String[] args) throws InterruptedException{
		MyThread.mt = Thread.currentThread();
		MyThread t = new MyThread();
		t.start();

		for(int i=0; i<10; i++) {
			System.out.println("main Thread");
			Thread.sleep(200);
		}
				
	}
}
