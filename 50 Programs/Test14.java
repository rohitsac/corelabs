package pack;

import java.util.Scanner;

public class Test14 {
	public static void main(String[] args) {
		System.out.println("Enter the no.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nod = 0;
		
		while(n != 0){
			int digit = n%10;
			System.out.println(digit);
			n = n/10;
			nod++;
		}
		System.out.println("Total no. of digits : "+nod);
	}

}

//	display no. of digits available in a no.