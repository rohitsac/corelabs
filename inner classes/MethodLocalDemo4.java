class Outer{
	public void m1(){
		// int x = 10;	
		final int x = 10;

		class inner{
			public void  m2(){
				System.out.println(x);	// in java7 u can't access local variable of method.
			}
		}

		inner i = new inner();
		i.m2();
	}
}


class MethodLocalDemo4{
	public static void main(String[] args) {
		Outer o = new Outer();
		o.m1();
	}
}