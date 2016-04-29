package pack;

import java.util.Scanner;

public class Test23 {
	public static void main(String[] args) {
		System.out.println("enter a no.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String msg = "";
		
		while(n!=0){
			int d = n%10;
			switch (d) {
			case 0:
				msg = "Zero "+msg; break;
			case 1:
				msg = "One "+msg; break;
			case 2:
				msg = "Two "+msg; break;
			case 3:
				msg = "Three "+msg; break;
			case 4:
				msg = "Four "+msg; break;
			case 5:
				msg = "Five "+msg; break;
			case 6:
				msg = "Six "+msg; break;
			case 7:
				msg = "Seven "+msg; break;
			case 8:
				msg = "Eight "+msg; break;
			case 9:
				msg = "Nine "+msg; break;
			}
			n = n/10;
		}
		System.out.println(msg);
	}
}

//	read a no. and display in word