//	Anonymous inner class

public class Lab9{
	
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<5; i++)
					System.out.println("Thread 1");
			}
		});
		
		t.start();
		
		for(int i=0; i<5; i++)
			System.out.println("Thread Main");
		
	}
	
}