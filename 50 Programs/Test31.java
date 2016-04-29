package pack;

import java.util.Scanner;

public class Test31 {
	public static void main(String[] args) {
		System.out.println("enter lower limit");
		Scanner sc = new Scanner(System.in);
		int ll = sc.nextInt();
		System.out.println("enter upper limit");
		int ul = sc.nextInt();
		
		for(int num=ll; num<ul; num++){
			int sum = 0;
			for(int i=1; i<num; i++){
				if(num%i == 0)
					sum = sum+i;
			}
			if(sum == num)
				System.out.println(num+" ");
		}
	}
}

//		perfect no. b/w range