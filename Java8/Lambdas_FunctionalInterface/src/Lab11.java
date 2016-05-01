interface interff{
	public void m1();
}

public class Lab11{
	int x = 11;
	
	public void m2(){
		interff i = () -> {
			int x=22;
			x = 33;
			System.out.println(x);
			System.out.println(this.x);
		};
		i.m1();
	}
	
	public static void main(String[] args) {
		Lab11 obj = new Lab11();
		obj.m2();
	}
}