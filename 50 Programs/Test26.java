package pack;

public class Test26 {
	public static void main(String[] args) {
		int limit = 10;
		int sum = 0;
		
		for(int n=1; n<=limit; n++){
			boolean flag = true;
			for(int i=2; i<n; i++){
				if(n%i == 0){
					flag = false;
					break;
				}
			}
			if(flag)
				sum = sum+n;
		}
		System.out.println(sum);
	}
}

//		sum of first 10 prime no.s