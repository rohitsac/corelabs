//	without Lambda Expression

interface interf{
	public void sum(int a, int b);
}

class Demo implements interf{
	@Override
	public void sum(int a, int b) {
		System.out.println("The sum is : "+(a+b));
	}
}

public class Lab3{
	public static void main(String[] args) {
		interf i = new Demo();
		i.sum(20, 10);
	}
}