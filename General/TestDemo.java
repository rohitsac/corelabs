class Test1{}
class Test2{}

class TestDemo{
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
	
	//	At run time if Test.class is not Found then NoClassDefFoundError
	//	compile it as >>	javac TestDemo.java
	//	delete the file "Test1"
	//	run as		  >>	java TestDemo
	// Test1 t = new Test1();
	// System.out.println(t);
		

	//	For this we have to handle / delegate ClassNotFoundEx & InstantiationException.
	//	run as >>	java TestDemo Test2
	// Object o = Class.forName(args[0]).newInstance();
	// System.out.println(o);	

	//	it will give ClassCastEx at runtime.
	//	run as >> java TestDemo Test2
	// String o = (String)Class.forName(args[0]).newInstance();

	}
}