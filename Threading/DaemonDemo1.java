class MyThread extends Thread{
	public void run(){
		for(int i=1; i<=10; i++){
			System.out.println("child Thread");
			try{
				Thread.sleep(100);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class DaemonDemo1{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.setDaemon(true);
		t.start();
		System.out.println("end of main");
	}
}

/**
	Once last non-daemon thread completed, the remaining Daemon threads will be terminated.
	If all threads are non-daemon then they will be executed until they finish their tasks.
**/