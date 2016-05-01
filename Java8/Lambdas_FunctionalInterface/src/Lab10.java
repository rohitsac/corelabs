//	Lab9 with Lambda Expression

public class Lab10{
	
	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			for(int i=0; i<5; i++)
				System.out.println("Thread 1");
			
		});
		
		t.start();
		
		for(int i=0; i<5; i++)
			System.out.println("Thread Main");
		
	}	
}