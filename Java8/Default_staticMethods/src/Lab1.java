interface inter{
	default void m1(){
		System.out.println("Default Method");
	}
}

public class Lab1 implements inter{
	public static void main(String[] args) {
		Lab1 obj = new Lab1();
		obj.m1();
	}
}
