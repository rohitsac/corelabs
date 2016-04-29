import java.util.*;

class HashSetDemo2{
	public static void main(String[] args) {
		Set s = new HashSet();

		Stu st = new Stu(101, "Asd");
		// s.add(st);
		// s.add(st);
		// s.add(st);
		s.add(new Stu(101, "Asd"));
		s.add(new Stu(101, "Asd"));
		s.add(new Stu(101, "Asd"));
		s.add(new Stu(102, "Qwe"));
		s.add(new Stu(103, "Zxc"));
		System.out.println(s);
	}
}


class Stu {

	int id;
	String name;

	Stu(int id, String name){
		this.id = id;
		this.name = name;
	}

	public String toString(){
		return id+"..."+name+"\n";
	}
}