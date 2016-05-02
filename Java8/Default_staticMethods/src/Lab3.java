interface left{
	default void m1(){
		System.out.println("left");
	}
}

interface right{
	default void m1(){
		System.out.println("right");
	}
}

/*
public class Lab3 implements left, right{	// ambiguity problem

}
*/