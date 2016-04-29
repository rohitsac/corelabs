package pack;

import java.util.Scanner;

public class Test25_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter lower limit");
		int ll = sc.nextInt();
		System.out.println("enter upper limit");
		int ul = sc.nextInt();
		
		for(int n=ll; n<=ul; n++){
			boolean flag = true;
			for(int i=2; i<n; i++){
				if(n %i == 0){
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.println(n+" ");
		}
	}
}

//	prime no. b/w to limits