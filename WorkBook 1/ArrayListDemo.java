import java.util.*;

class ArrayListDemo{
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println(al.getClass().getName());
		System.out.println("***********-----------**********");

		Class c = al.getClass();
		System.out.println(c);
		System.out.println(c.getSuperclass());
		System.out.println(c.getSuperclass().getSuperclass());
		System.out.println(c.getSuperclass().getSuperclass().getSuperclass());
		System.out.println(c.getSuperclass().getSuperclass().getSuperclass().getSuperclass());
	}
}