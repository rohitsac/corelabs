import java.lang.reflect.*;

class FinalTest{
	public static void main(String[] args) throws Exception{
		 // System.out.println(new FinalVar().A);	//	can't access private variable.
		
		//	but here is a way...
		FinalVar fv = new FinalVar();
		Field field = fv.getClass().getDeclaredField("A");
		field.setAccessible(true);

		//	Accessing private field
		System.out.println("Accessing private field : "+field.get(fv));

		//	Modifying final variable
		field.set(fv, 20);
		System.out.println("Modifying final variable : "+field.get(fv));

		System.out.println("---------*********--------");

		Field f = fv.getClass().getDeclaredField("B");
		f.setAccessible(true);
		f.set(fv, 20);
		System.out.println(f.get(fv));
		System.out.println(new FinalVar().B);
	}
}

class FinalVar{
	private final int A = 30;
	final int B = 10;
}