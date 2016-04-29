package pack;

public class Test36 {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = a+b;
		System.out.println(a+"\n"+b);
		
		for(int i=3; i<=10; i++){
			c = a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}
}

//	first 10 no.s of fibonacci series