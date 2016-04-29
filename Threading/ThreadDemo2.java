class ThreadDemo2 {
	public static void main(String[] args) throws InterruptedException{

		Thread.currentThread().setName("ROHIT");

		// System.out.println(10/0);

		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread());
		System.out.println("main Thread......");
		
		Thread t = new Thread();
		System.out.println(t.getPriority());	//	inherited from main thread

		// Thread.currentThread().setPriority(-15);

		// Thread.currentThread().yield();
		// System.out.println("After yield()...");

		
		

	}

}