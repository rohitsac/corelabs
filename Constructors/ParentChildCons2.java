class Parent{
	
	Parent(){
		System.out.println("Parent");
	}
}

class Child extends Parent{


	Child(){
		System.out.println("Child");
	}

}

class ParentChildCons2{
	public static void main(String[] args) throws Exception{
		// Child c = new Child();
		// Thread.sleep(5000000);
		// Parent p = new Parent();
		Parent pc = new Child();
	}
}