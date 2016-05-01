interface one{
	default void m1(){
		System.out.println("left");
	}
}

interface two{
	static void m1(){
		System.out.println("right");
	}
}

public class Lab3_ implements one, two{	
	
}
