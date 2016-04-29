class Outer{
	int x = 10;
	static int y =  20;

	public void m1(){
		class inner{
			public void m2(){
				System.out.println(x);
				System.out.println(y);
			}
		}

		inner i = new inner();
		i.m2();
	}
}


class MethodLocalDemo2{
	public static void main(String[] args) {
		Outer o = new Outer();
		o.m1();
	}
}