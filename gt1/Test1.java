package gt1;

class MyThread implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}


public class Test1 {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		Thread t1 = new Thread(t);
		t1.setName("T1");
		t1.setPriority(5);
		t1.start();
		
		Thread t2 = new Thread(t);
		t2.setName("T2");
		t2.setPriority(-1);
		t2.start();
	}
}
