import java.util.*;

class ComparablrDemo{
	public static void main(String[] args) {
		Set s = new TreeSet();

		Stu st = new Stu(101, "Asd");
		
		s.add(new Stu(101, "Asd"));
		s.add(new Stu(101, "Asd"));
		s.add(new Stu(102, "Qwe"));
		s.add(new Stu(103, "Zxc"));
		System.out.println(s);
	}
}

class Stu implements Comparable{

	int id;
	String name;

	Stu(int id, String name){
		this.id = id;
		this.name = name;
	}

	public int compareTo(Object obj){
		if(obj instanceof Stu){
			Stu st = (Stu)obj;
			return this.id-st.id;
		}
		return 0;
	}

	public String toString(){
		return id+"..."+name;
	}
}

