import java.io.*;

public class SerializationDemo2 {

	public static void main(String[] args)throws Exception{
		Dog d1=new Dog();
		Cat c1=new Cat();
		System.out.println("Serialization started");
		FileOutputStream fos=new FileOutputStream("abc.serv");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.writeObject(c1);

		System.out.println("Serialization ended");
		
		System.out.println("Deserialization started");
		
		FileInputStream fis=new FileInputStream("abc.serv");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog)ois.readObject();
		Cat c2=(Cat)ois.readObject();
		System.out.println("Deseriasation completed");

		System.out.println(d1.i+"  "+d1.j);
		System.out.println(c1.i+"  "+c1.j);
		System.out.println(d2.i+"  "+d2.j);
		System.out.println(c2.i+"  "+c2.j);
		
	}
}
class Dog implements Serializable
{
	transient int i=10;
	int j=20;
}
class Cat implements Serializable
{
	int i=30;
	int j=40;
}


