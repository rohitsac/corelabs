interface Outer {
	public void m1();
	
	interface inner{
		public void m2();
	}
}	
	
class Test1 implements Outer{
	public void m1(){
		System.out.println("outer interface method implementation");
	}
}

class Test2 implements Outer.inner{
	public void m2(){
		System.out.println("inner interface method implementation");
	}
}

class InnerInterfaceTest{
	public static void main(String [] as){
		Test1 t1 = new Test1();
		t1.m1();
		
		Test2 t2 = new Test2();
		t2.m2();
	}
}