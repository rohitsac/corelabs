//	same as MethodLocalDemo2 but m1() is static

class Outer{
	int x = 10;
	static int y =  20;

	public static void m1(){
		class inner{
			public void m2(){
				// System.out.println(x);	// x can't be accessed from static context.
				System.out.println(y);
			}
		}

		inner i = new inner();
		i.m2();
	}
}


class MethodLocalDemo3{
	public static void main(String[] args) {
		Outer o = new Outer();
		o.m1();
	}
}