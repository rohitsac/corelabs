package pack;

import java.util.Scanner;

public class Test27 {
	public static void main(String[] args) {
		System.out.println("enter a no.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int num1 = num;
		
		while(num != 0){
			int digit = num % 10;
			sum = sum + (digit*digit*digit);
			num = num/10;
		}
		if(sum == num1)
			System.out.println("YEAH !!! ARMSTRONG");
		else System.out.println("nooooooooooooo");
	}
}

//		no. is armstrong or not