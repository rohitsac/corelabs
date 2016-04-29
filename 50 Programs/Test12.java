package pack;

import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		System.out.println("Enter no.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
			if(i%2 == 0)
				System.out.println(i+" ");
	}
}

//	print first n even no.s