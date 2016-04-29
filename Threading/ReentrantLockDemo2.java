import java.util.concurrent.locks.*;

class MyThread extends Thread{
	static ReentrantLock l = new ReentrantLock();
	
	MyThread(String name){
		super(name);
	}

	public void run(){
		if(l.tryLock()){
			System.out.println(Thread.currentThread().getName()+" got lock and performing safe operation");
			try{
				Thread.sleep(100);
			}catch (InterruptedException e) {
				l.unlock();
			}
		}
		else{
			System.out.println(Thread.currentThread().getName()+" not got lock and performing alternative operation");
		}
	}
}


class ReentrantLockDemo2{
	public static void main(String[] args) {

		MyThread t1 = new MyThread("First Thread");
		MyThread t2 = new MyThread("Second Thread");

		t1.start();
		t2.start();
	}
}