package pack;

import java.util.Scanner;

public class Test28 {
	public static void main(String[] args) {
		System.out.println("enter lower limit");
		Scanner sc = new Scanner(System.in);
		int ll = sc.nextInt();
		System.out.println("enter upper limit");
		int ul = sc.nextInt();
		
		for(int num=ll; num<=ul; num++){
			int sum = 0;
			int num1 = num;
			while(num1 != 0){
				int d= num1%10;
				sum = sum +(d*d*d);
				num1 = num1/10;
			}
			if(sum == num)	System.out.println(sum);
		}
	
	}
}

//		armstrong no. b/w range