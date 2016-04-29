package pack;


public class Test25 {
	public static void main(String[] args) {
		int limit = 200;
		
		for(int n=100; n<=limit; n++){
			boolean flag = true;
			for(int i=2; i<n; i++){
				if(n %i == 0){
					flag = false;
					break;
				}
			}
			if(flag)	System.out.println(n+" ");
		}
		
	}
}

//	prime no. b/w 100 and 200