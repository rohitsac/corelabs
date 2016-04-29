class ParentThread extends Thread{
	
	static ThreadLocal tl = new ThreadLocal();

	public void run(){
		tl.set("Hello");
		System.out.println(tl.get());

		ChildThread ct = new ChildThread();
		ct.start();
	}
}

class ChildThread extends Thread{
	public void run(){
		System.out.println(ParentThread.tl.get());
	}
}


class ThreadLocalDemo3{
	public static void main(String[] args) {
		ParentThread pt = new ParentThread();
		pt.start();	
	}
}