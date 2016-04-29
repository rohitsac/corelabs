package singletonDP5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Singleton4 implements Serializable {
		private static Singleton4 soleSingleton4 = new Singleton4();	//	eager

	private Singleton4(){
		System.out.println("Creating....");
	}

	public static Singleton4 getInstance(){
		return soleSingleton4;
	}
	
}

class TestClassForSingleton4{

	static void print(String name, Singleton4 obj){
		System.out.println(String.format("Object : %s, HashCode : %d", name, obj.hashCode()));
	}

	public static void main(String[] args) throws Exception{
		Singleton4 s1 = Singleton4.getInstance();
		Singleton4 s2 = Singleton4.getInstance();

		print("s1", s1);
		print("s2", s2);


	/************************************************************/
//2.		Now see How Serialization violates this
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("s2.ser"));
	oos.writeObject(s2);
		
	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("s2.ser"));
	Singleton4 s3 = (Singleton4) ois.readObject();
	print("s3", s3);
	
		
		
		
	}
	
}