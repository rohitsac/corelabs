class MyThread extends Thread{
	public void run(){
		for(int i=0; i<10; i++) {
			System.out.println("child Thread");
			try{
				Thread.sleep(10);
			}catch (Exception e) {
				System.out.println("Exception");
			}
		}
	}
}

class JoinDemo {
	public static void main(String[] args) throws InterruptedException{
		MyThread t = new MyThread();
		t.start();
		t.join();		

		for(int i=0; i<10; i++) 
			System.out.println("main Thread");
		
	}
}

/**
Fix OutPut, bcoz main Thread will wait until child is not completed.
**/
