package pack;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 no.s");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("before swapping "+a+"\t"+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping : "+a+"\t"+b);
	}
}

// swapping without 3rd variable