class A{
	public synchronized void m1(B b){
		System.out.println("Thread-1 executing A--m1().....");
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			System.out.println("Exccccccception");
		}
		System.out.println("Thread-1 calling B--last()....");
		b.last();
	}

	public synchronized void last(){
		System.out.println("A--last()...");
	}
}

class B{
	public synchronized void m2(A a){
		System.out.println("Thread-2 executing B--m2().....");
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			System.out.println("Exccccccception");
		}
		System.out.println("Thread-2 calling A--last()....");
		a.last();
	}

	public synchronized void last(){
		System.out.println("B--last()...");
	}
}


class DeadLockDemo2 extends Thread{

	A a = new A();
	B b = new B();

	public void m(){
		this.start();
		a.m1(b);		//	main Thread
	}

	public void run(){
		b.m2(a);		//	Child Thread
	}

	public static void main(String[] args) throws InterruptedException{
		
		DeadLockDemo2 d = new DeadLockDemo2();
		d.m();

	}
}
