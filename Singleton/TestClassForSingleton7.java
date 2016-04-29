package singletonDP4.copy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Singleton7 {
	
	private static Singleton7 soleSingleton7 = null;	//	Lazy

	private Singleton7(){
		System.out.println("Creating....");
	}

	public static Singleton7 getInstance(){
		if(soleSingleton7 == null)
			soleSingleton7 = new Singleton7();
		return soleSingleton7;
	}
	

}

class TestClassForSingleton7{

//4.		Now see How MultiThreaded Access violates this	
	
	static void useSingleton(){
		Singleton7 Singleton7 = Singleton7.getInstance();
		print("Singleton77", Singleton7);
	}

	static void print(String name, Singleton7 obj){
		System.out.println(String.format("Object : %s, HashCode : %d", name, obj.hashCode()));
	}

	public static void main(String[] args) throws Exception{
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(TestClassForSingleton::useSingleton);
		service.shutdown();

	

/*
 * 			run it multiple times and it may work good as expected.		
 */
	
		
		
		
		
		
		
		
		
	}
	
}