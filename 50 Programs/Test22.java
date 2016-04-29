package pack;

import java.util.Scanner;

public class Test22 {
	public static void main(String[] args) {
		System.out.println("enter a no.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0;
		int n1 = n;
		
		while(n != 0){
			int rem = n%10;
			rev = rev*10+rem;
			n = n/10;
		}
		System.out.println(n1);
		System.out.println(rev);
		if(rev == n1)
			System.out.println("Palindrome");
		else
			System.out.println("not Palindrome");
	}
}

//	palindrome or not