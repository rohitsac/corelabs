package pack;

import java.util.Scanner;

public class Test16 {
	public static void main(String[] args) {
		System.out.println("enter a no.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = 0;
		
		while(n != 0){
			int digit = n % 10;
			s = s+digit;
			n = n/10;
		}
		System.out.println("sum of digits : "+s);
	}
}

//	sum of digits of a number