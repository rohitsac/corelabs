//	calling static methods.

interface interfaceA{
	public static void sum() {
		System.out.println("static method");
	}
}

interface interfaceB{
	public default void sub() {
		System.out.println("default method");
	}
}

public class Lab5 implements interfaceA, interfaceB{

	public static void main(String[] args) {
//		sum();				// illegal
//		new Lab5().sum();	// illegal
//		Lab5.sum();			// illegal
		interfaceA.sum();
		
		
//		interfaceB.sub();	// illegal
//		Lab5.sub();			// illegal
		new Lab5().sub();
	}
	
}
