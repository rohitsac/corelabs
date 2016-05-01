public class Lab8{
	public static void main(String[] args) {
		System.out.println("Lab8 running....");
		
		Runnable r = () -> {
			for(int i=0; i<5; i++)
				System.out.println("Thread 1");
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0; i<5; i++)
			System.out.println("Thread 2");
	}
}