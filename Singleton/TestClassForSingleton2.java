package singletonDP2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

class Singleton implements Serializable {
//		private static Singleton soleSingleton = new Singleton();	//	eager
//		solution
	private static Singleton soleSingleton = null;	//	eager
	
	private Singleton(){
		System.out.println("Creating....");
	}

	public static Singleton getInstance(){
		if(soleSingleton == null)
			soleSingleton = new Singleton();
		return soleSingleton;
	}
	
//	solution
	private Object readResolve() throws ObjectStreamException{
		System.out.println(".....read resolve.....");
		return soleSingleton;
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


	/************************************************************/
//2.		Now see How Serialization violates this
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("s2.ser"));
	oos.writeObject(s2);
		
	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("s2.ser"));
	Singleton s3 = (Singleton) ois.readObject();
	print("s3", s3);
	
		
		
		
	}
	
}