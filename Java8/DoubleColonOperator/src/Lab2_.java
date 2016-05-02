//	using :: Operator

public class Lab2_ {

	public void m1() {
		for (int i = 0; i <= 10; i++)
			System.out.println("Thread 1");
	}

	public static void main(String[] args) {

		Runnable r = new Lab2_()::m1;
		
		Thread t = new Thread(r);
		t.start();
		
		for (int i = 0; i <= 10; i++)
			System.out.println("Thread Main");
		
	}
}
