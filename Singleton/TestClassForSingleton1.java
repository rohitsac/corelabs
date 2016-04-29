import java.lang.reflect.Constructor;

final class Singleton {
		private static Singleton soleSingleton = new Singleton();	//	eager

	private Singleton(){
		//	SOLUTION
	/*	 if(soleSingleton != null)
			throw new RuntimeException("Please use getInstance()");*/

		System.out.println("Creating....");
	}

	public static Singleton getInstance(){
		return soleSingleton;
	}
	
}

class TestClassForSingleton{

	static void print(String name, Singleton obj){
		System.out.println(String.format("Object : %s, HashCode : %d", name, obj.hashCode()));
	}

	public static void main(String[] args) throws Exception{

//2.	What if we put that same code here		
		/*Class clazz = Class.forName("singletonDP.Singleton");
		Constructor<Singleton> ct = clazz.getDeclaredConstructor();
		ct.setAccessible(true);
		Singleton s3 = ct.newInstance();
		print("s3", s3);*/
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		print("s1", s1);
		print("s2", s2);

//1.	Now see How Reflection violates this
		Class clazz = Class.forName("singletonDP.Singleton");
		Constructor<Singleton> ct = clazz.getDeclaredConstructor();
		ct.setAccessible(true);
		Singleton s3 = ct.newInstance();
		print("s3", s3);
		
	}
	
}