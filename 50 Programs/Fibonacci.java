package pack;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = a+b;
		System.out.println(a+"\n"+b);
		
		for(int i=3; i<=10; i++){
			c = a+b;
			a = b;
			b = c;
			System.out.println(c);
		}
	}
}
