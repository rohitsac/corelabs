package pack;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year");
		int a = sc.nextInt();
		
		if((a%400 == 0) || ((a%4 == 0) && (a%100 != 0))){
			System.out.println("CHEERS ! Leap Year");
		}
		else	System.out.println("OOPs! not leap");
	}

}

//	check if it is leap year or not