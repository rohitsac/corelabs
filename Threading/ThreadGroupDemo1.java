class MyThread extends Thread{
	MyThread(ThreadGroup g, String name){
		super(g, name);		// the job of constructor is to associate our Thread to ThreadGroup.
	}
	public void run(){
		System.out.println("child Thread");
		try{
			Thread.sleep(2000);
		}catch (Exception e) {	}
	}
}

class ThreadGroupDemo1{
	public static void main(String[] args) throws InterruptedException{
		ThreadGroup pg = new ThreadGroup("PG");
		ThreadGroup cg = new ThreadGroup(pg, "CG");
		
		MyThread t1 = new MyThread(pg, "CT1");
		MyThread t2 = new MyThread(pg, "CT2");

		t1.start();
		t2.start();

		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());

		pg.list();
		
		Thread.sleep(5000);
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());

		pg.list();
		


	}
}