package pack;

import java.util.Scanner;

public class Test20 {
	public static void main(String[] args) {
		System.out.println("enter a no.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = 0;
		
		while(n!=0){
			int f = 1;
			int d = n%10;
			for(int i=1; i<=d; i++)
				f = f * i;
			s = s+f;
			n = n/10;
		}
		System.out.println(s);
	}
}

//	display sum of factorial of digits