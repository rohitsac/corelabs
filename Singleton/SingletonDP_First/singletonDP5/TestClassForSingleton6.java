package singletonDP5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Singleton implements Serializable, Cloneable{
	//	use this for first 3 cases.
	//	private static Singleton soleSingleton = new Singleton();	//	eager
	//	use this for 4th case.
	private static Singleton soleSingleton = null;	//	Lazy

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

class TestClassForSingleton6{

	static void print(String name, Singleton obj){
		System.out.println(String.format("Object : %s, HashCode : %d", name, obj.hashCode()));
	}

	public static void main(String[] args) throws Exception{
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		print("s1", s1);
		print("s2", s2);

//1.		Now see How Reflection violates this
		/*Class clazz = Class.forName("singletonDP.Singleton");
		Constructor<Singleton> ct = clazz.getDeclaredConstructor();
		ct.setAccessible(true);
		Singleton s3 = ct.newInstance();
		print("s3", s3);*/
	/************************************************************/
//2.		Now see How Serialization violates this
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("s2.ser"));
	oos.writeObject(s2);
		
	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("s2.ser"));
	Singleton s3 = (Singleton) ois.readObject();
	print("s3", s3);
		
	/************************************************************/
//3.		Now see How Cloning violates this
		/*Singleton s3 = (Singleton)s2.clone();
		print("s3", s3);*/
		
//4.		Now see How MultiThreading violates this		
		
		
		
		
		
		
		
		
	}
	
}