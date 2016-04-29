package pack;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		System.out.println("enter no.");
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
			if(i%2 != 0)
				sum = sum+i;
		System.out.println(sum);
	}
}

//	sum of first Odd no.s