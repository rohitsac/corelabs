package pack;

import java.util.Scanner;

public class Test19 {
	public static void main(String[] args) {
		System.out.println("enter a no.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = 0;
		
		while(n !=0){
			int digit = n%10;
			s = s+(digit*digit*digit);
			n = n/10;
		}
		System.out.println(s);
	}
}

//	sum of cubes of digits of a no.