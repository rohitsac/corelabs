//	Overriding Default methods.

interface C{
	default void m1(){
		System.out.println("left");
	}
}

interface D{
	default void m1(){
		System.out.println("right");
	}
}

public class Lab4 implements C, D{

	@Override
	public void m1() {
		System.out.println("m1() overridden...");
	}	

	public static void main(String[] args) {
		Lab4 obj = new Lab4();
		obj.m1();
	}
	
}
