import java.util.*;

class ListSetDemo {
	public static void main(String[] args) {
		
		List l = new ArrayList();
		l.add("A");
		l.add("A");
		l.add(null);
		l.add(null);
		System.out.println(l);

		Set s = new HashSet();
		s.add("A");
		s.add("A");
		s.add(null);
		s.add(null);
		System.out.println(s);
	}
}