package pack;

public class Test37 {
	public static void main(String[] args) {
		int a = 0;
		int b = 1; 
		int sum = a+b;
		int c = a+b;
		
		for(int i=3; i<=10; i++){
			c = a+b;
			a = b;
			b = c;
			sum = sum+c;
		}
		System.out.println(sum);
	}
}

//		sum of first 10 digits of fibonacci series