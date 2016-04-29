package pack;

import java.util.Scanner;

public class Test17 {
	public static void main(String[] args) {
		System.out.println("enter a no.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int es = 0;
		int os = 0;
		
		while(n != 0){
			int digit = n % 10;
			if(digit%2 == 0)	es = es+digit;
			else 				os = os+digit;
			n = n/10;
		}
		System.out.println("sum of even digits : "+es);
		System.out.println("sum of odd digits : "+os);
	}
}

//	sum of even and odd digits of a no.