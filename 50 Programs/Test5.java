package pack;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 no.s");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int rem = a - (a/b)*b;
		System.out.println(rem);
	}
}
//	display remainder without %