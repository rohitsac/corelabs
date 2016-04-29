package pack;

public class Test29 {
	public static void main(String[] args) {
		int limit = 1000;
		int total = 0;
		for(int num=2; num<=limit; num++){
			int sum = 0;
			int num1 = num;
			while(num1 != 0){
				int digit = num%10;
				sum = sum+(digit*digit*digit);
				num1 = num1/10;
			}
			if(sum == num)
				total = total + sum;
		}
		System.out.println(total);
	}
}

//		sum of first 10 armstrong no.