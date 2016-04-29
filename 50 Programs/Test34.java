package pack;

public class Test34 {
	public static void main(String[] args) {
		int limit = 100000;
		
		for(int num=1; num<=limit; num++){
			int sum = 0;
			int num1 = num;
			while(num1 != 0){
				int digit = num1%10;
				int fact = 1;
				for(int j=1; j<=digit; j++)
					fact = fact*j;
				sum = sum + fact;
				num1 = num1/10;
			}
			if(sum == num)
				System.out.println(num);
		}
	}
}

//		strong no. b/w 100 - 100000