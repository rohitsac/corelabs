class Outer{
	int x = 10;
	static int y = 50;
	int z = 30;
	class Inner{
		int x = 100;
		void m1(){
			int x = 1000;
			// static int y = 50;	// can't declare static var inside inner class
			System.out.println(x);
			System.out.println(this);
			System.out.println(this.x);
			System.out.println(Inner.this.x);
			System.out.println(Outer.this.x);
			System.out.println(y);
			System.out.println(z);
		}

	}
}

class InnerDemo{
	public static void main(String[] args) {
		new Outer().new Inner().m1();
	}
}

