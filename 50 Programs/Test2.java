package pack;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 no.s");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("before swapping "+a+"\t"+b);
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("after swapping "+a+"\t"+b);
	}
}

//	swap using bitwise operator