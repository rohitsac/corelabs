interface interfff{
	public void m1();
}

public class Lab12{
	int x = 11;
	
	public void m2(){
		int y = 22;
		interfff i = () -> {
			int z=33;
			x = 101;
//			y = 202;	// final
			z = 303;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(y);
			System.out.println(z);
		};
		i.m1();
	}
	
	public static void main(String[] args) {
		Lab12 obj = new Lab12();
		obj.m2();
	}
}