import java.io.*;

public class Lab887 {

	public static void main(String[] args)throws Exception 
	{
		
		FileOutputStream fos=new FileOutputStream("info.ser");
	    ObjectOutputStream oos=new ObjectOutputStream(fos);
	    Student st=new Student(99,"pankaj",9999);
	    Student.count=9;
	    System.out.println(st);
	    oos.writeObject(st);
	    System.out.println("object serialized");

	    System.out.println("Deserialization started");
		
		FileInputStream fis=new FileInputStream("info.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student sobj = (Student)ois.readObject();
		System.out.println(sobj);
		System.out.println("Deseriasation completed");
	}
}
class Student implements Serializable
{
	transient int sid;
	String sname;
	long phone;
	static int count=3;

	Student(int sid, String sname,long phone){
		this.sid=sid;
		this.sname=sname;
		this.phone=phone;
	}
	public String toString()
	{
		return sid+" "+sname+" "+phone;
	}
}