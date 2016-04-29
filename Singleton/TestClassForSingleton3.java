package singletonDP3;

import java.io.Serializable;

class Singleton implements Serializable, Cloneable{
		private static Singleton soleSingleton = new Singleton();	//	eager

	private Singleton(){
		System.out.println("Creating....");
	}

	public static Singleton getInstance(){
		return soleSingleton;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

class TestClassForSingleton{

	static void print(String name, Singleton obj){
		System.out.println(String.format("Object : %s, HashCode : %d", name, obj.hashCode()));
	}

	public static void main(String[] args) throws Exception{
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		print("s1", s1);
		print("s2", s2);

		
//3.		Now see How Cloning violates this
		Singleton s3 = (Singleton)s2.clone();
		print("s3", s3);
		
	}
	
}