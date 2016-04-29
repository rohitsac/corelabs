abstract class MyAbstractClass{
	MyAbstractClass(){
		System.out.println(this);
	}
}

class AbstractDemo3{
	public static void main(String[] args) throws Exception {
		
		// MyAbstractClass mobj = Class.forName("MyAbstractClass").newInstance();
		// MyAbstractClass mobj = (MyAbstractClass)Class.forName("MyAbstractClass").newInstance();
		
	/*	Class c = Class.forName("MyAbstractClass");
		MyAbstractClass mobj = (MyAbstractClass)c.newInstance();
	*/
		// System.out.println(mobj);
	}
}


