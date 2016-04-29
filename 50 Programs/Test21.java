package pack;

import java.util.Scanner;

public class Test21 {
	public static void main(String[] args) {
		System.out.println("enter a no.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0;
		
		while(n != 0){
			int rem = n % 10;
			rev = rev*10+rem;
			n = n/10;
		}
		System.out.println(rev);
	}
}

//	reverse a given no.