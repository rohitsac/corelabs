package pack;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 no.s");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int q = 0;
		
		while(a>=b){
			a = a-b;
			q++;
		}
		System.out.println(q);
	}

}
//	display quotient without / operator