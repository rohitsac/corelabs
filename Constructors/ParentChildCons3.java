class Parent{
	
	Parent(){
		System.out.println(this);
		System.out.println(this.hashCode());
		System.out.println("Parent");
	}
}

class Child extends Parent{


	Child(){
		System.out.println(this);
		System.out.println(this.hashCode());
		System.out.println("Child");
	}

}

class ParentChildCons3{
	public static void main(String[] args) throws Exception{
		Child c = new Child();			//	same hashcode
		// Thread.sleep(5000000);
		// Parent p = new Parent();
		// Parent pc = new Child();
		System.out.println("-----"+c.hashCode());
	}
}