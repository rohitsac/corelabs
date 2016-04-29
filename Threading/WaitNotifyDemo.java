class ThreadA extends Thread{
	int total = 0;

	public void run(){
		synchronized (this){
			System.out.println("child Thread starts calculation....");
			for(int i=0; i<=100; i++){
				total = total+i;
			}
			System.out.println("child giving notification.....");
			this.notify();
		}
	}
}


class WaitNotifyDemo{
	public static void main(String[] args) throws InterruptedException{
		ThreadA t = new ThreadA();
		t.start();
		synchronized(t){
			System.out.println("main Thread trying to call wait()....");
			t.wait();
			System.out.println("main Thread got notification");
			System.out.println(t.total);
		}
	}
}