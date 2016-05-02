//	using :: Operator

public class Lab2 {

	public static void m1() {
		for (int i = 0; i <= 10; i++)
			System.out.println("Thread 1");
	}

	public static void main(String[] args) {

		Runnable r = Lab2::m1;
		
		Thread t = new Thread(r);
		t.start();
		
		for (int i = 0; i <= 10; i++)
			System.out.println("Thread Main");
		
	}
}
