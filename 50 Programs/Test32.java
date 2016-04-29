package pack;

public class Test32 {
	public static void main(String[] args) {
		int limit = 10000;
		int total = 0;
		
		for(int num=1; num<=limit; num++){
			int sum = 0;
			for(int i=1; i<=num; i++){
				if(num%i == 0)
					sum = sum+i;
			}
			if(sum == num){
			//	System.out.println(num+" ");
				total = total + sum;
			}
		}
		System.out.println(total);
	}
}

//		sum of first 10 perfect no.