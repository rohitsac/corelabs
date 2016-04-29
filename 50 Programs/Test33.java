package pack;

import java.util.Scanner;

public class Test33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.");
		int n = sc.nextInt();
		int sum = 0;
		int n1 = n;
		
		while(n1 != 0){
			int digit = n1%10;
			int fact = 1;
			for(int j=1; j<=digit; j++)
				fact = fact*j;
			sum = sum+fact;
			n1 = n1/10;
		}
		if(sum == n)	System.out.println("strong");
		else			System.out.println("not strong");
	}
}

//		no. is strong or not

//	The sum of the factorials of digits of a number is equal to the original number.