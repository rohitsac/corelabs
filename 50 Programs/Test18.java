package pack;

import java.util.Scanner;

public class Test18 {
	public static void main(String[] args) {
		System.out.println("enter a no.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = 0;
		
		while(n != 0){
			int digit = n%10;
			s = s+(digit*digit);
			n = n/10;
		}
		System.out.println(s);
	}
}

//	sum of squares of digits of a no.