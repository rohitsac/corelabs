package pack;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		int n = sc.nextInt();
		
		if(n>=1){
			for(int i=1; i<=n; i++)
				System.out.println(i+" ");
		}
	}

}

//	print first n Natural no.s