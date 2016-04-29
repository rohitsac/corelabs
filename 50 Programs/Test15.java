package pack;

import java.util.Scanner;

public class Test15 {
	public static void main(String[] args) {
		System.out.println("enter a no.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ed = 0;
		int od = 0;
		
		while(n != 0){
			int digit = n%10;
			if(digit%2 == 0)
				ed++;
			else
				od++;
			n = n/10;
		}
		System.out.println("even digits : "+ed);
		System.out.println("odd digits : "+od);
	}
}

//	display no. of even and digits available in a given number