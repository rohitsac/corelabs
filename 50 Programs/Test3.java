package pack;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no.s to add");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int carry;
		
		while(b != 0){
			carry = a&b;
			a = a^b;
			b = carry << 1;
		}
		System.out.println("sum is : "+a);
	}

}

//	display sum without +