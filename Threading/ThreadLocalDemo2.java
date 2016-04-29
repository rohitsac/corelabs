class CustomerThread extends Thread{
	static Integer custId = 0;
	private static ThreadLocal tl = new ThreadLocal(){
		public Integer initialValue(){
			return ++custId;
		}
	};

	CustomerThread(String name){
		super(name);
	}
	public void run(){
		System.out.println(Thread.currentThread().getName()+" is executing with Customer ID : "+tl.get());
	}
}


class ThreadLocalDemo2{
	public static void main(String[] args) {

		CustomerThread ct1 = new CustomerThread("CT-1");
		CustomerThread ct2 = new CustomerThread("CT-2");
		CustomerThread ct3 = new CustomerThread("CT-3");
		CustomerThread ct4 = new CustomerThread("CT-4");

		ct1.start();
		ct2.start();
		ct3.start();
		ct4.start();

	}
}