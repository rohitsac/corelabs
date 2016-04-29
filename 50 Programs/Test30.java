package pack;

import java.util.Scanner;

public class Test30 {
	public static void main(String[] args) {
		System.out.println("enter a no.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<n; i++){
			if(n%i == 0)
				sum = sum+i;
		}
			if(n == sum)	System.out.println("perfect");
			else			System.out.println("not perfect");
	}
}

//		no. is perfect or not

/*
In number theory, a perfect number is a positive integer that is equal to the sum of its 
proper positive divisors, that is, the sum of its positive divisors excluding the number itself
 (also known as its aliquot sum).
*/