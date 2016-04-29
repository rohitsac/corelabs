package pack;

import java.util.Scanner;

public class Test24 {
	public static void main(String[] args) {
		System.out.println("enter a no.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = true;
		
		for(int i=2; i<n; i++){
			if(n%i == 0){
				flag = false;
				break;
			}
		}
		if(flag)	System.out.println("Yeah !!!  PRIME");
		else		System.out.println("Oops... not Prime");
	}
}

//	no. is prime or not