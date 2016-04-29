package singletonDP5;

import java.io.Serializable;

class Singleton5 implements Serializable, Cloneable{
		private static Singleton5 soleSingleton5 = new Singleton5();	//	eager

	private Singleton5(){
		System.out.println("Creating....");
	}

	public static Singleton5 getInstance(){
		return soleSingleton5;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

class TestClassForSingleton5{

	static void print(String name, Singleton5 obj){
		System.out.println(String.format("Object : %s, HashCode : %d", name, obj.hashCode()));
	}

	public static void main(String[] args) throws Exception{
		Singleton5 s1 = Singleton5.getInstance();
		Singleton5 s2 = Singleton5.getInstance();

		print("s1", s1);
		print("s2", s2);

		
//3.		Now see How Cloning violates this
		Singleton5 s3 = (Singleton5)s2.clone();
		print("s3", s3);
		
	}
	
}