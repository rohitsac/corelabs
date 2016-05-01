package misc;

class B {
	B(int i){
		System.out.println("B(int)");
	}
}

class Ab extends B {
/*	Ab(){
		System.out.println("A()");
	}
*/
}

class C{
	public static void main(String[] args) {
		B b1=new B(2);
		System.out.println("Hello World!");
		Ab a1=new Ab();
		B b2 = new Ab();
	}
}