abstract class MyAbstractClass{
	MyAbstractClass(){
		System.out.println(this);
	}
}

class AbstractDemo2{
	public static void main(String[] args) throws Exception {
		MyAbstractClass mobj = Class.forName("MyAbstractClass").newInstance();
		System.out.println(mobj);
	}
}


//	see error message