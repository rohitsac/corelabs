//	Lab3 with Lambda Expression

interface interfa{
	public void sum(int a, int b);
}


public class Lab4{
	public static void main(String[] args) {
		interf i = (a, b) -> System.out.println("The sum is... : "+(a+b));
		i.sum(20, 10);
	}
}