package pack;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no.");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
			sum = sum+i;
		System.out.println(sum);
	}
}

//	sum of first n natural no.s