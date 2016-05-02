interface interB{
	public static void m1(){
		System.out.println("interA--static");
	}
}


public class Lab7 implements interB {
	public void m1(){							// valid but not overriding
		System.out.println("Lab6--static");
	}
	
}
