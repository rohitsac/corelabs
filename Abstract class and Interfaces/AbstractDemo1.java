abstract class MyAbstractClass{
	MyAbstractClass(){
		System.out.println(this);
	}
}

class AbstractDemo1{
	public static void main(String[] args) {
		MyAbstractClass mobj = new MyAbstractClass(){};
		System.out.println(mobj);
	}
}