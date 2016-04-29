package singletonDP4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Singleton {
	
	private static Singleton soleSingleton = null;	//	Lazy

	private Singleton(){
		System.out.println("Creating....");
	}

	public static Singleton getInstance(){		// use synchronized to resolve
		if(soleSingleton == null)
			soleSingleton = new Singleton();
		return soleSingleton;
	}

}

class TestClassForSingleton{

//4.		Now see How MultiThreaded Access violates this	
	
	static void useSingleton(){
		Singleton singleton = Singleton.getInstance();
		print("singleton", singleton);
	}

	static void print(String name, Singleton obj){
		System.out.println(String.format("Object : %s, HashCode : %d", name, obj.hashCode()));
	}

	public static void main(String[] args) throws Exception{
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(TestClassForSingleton::useSingleton);
		service.submit(TestClassForSingleton::useSingleton);
		service.shutdown();

/*
 * 			run it multiple times and it may work good as expected.		
 */

		
	}
	
}