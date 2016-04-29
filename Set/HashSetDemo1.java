import java.util.*;

class HashSetDemo1{
	public static void main(String[] args) {

	//	------------	HashSet	---------------------//
		Set s = new HashSet();
		s.add(101);
		s.add(101);
		s.add(101);
		System.out.println(s.add(101));
		s.add(null);
		s.add(null);
		System.out.println(s);

//	------------	LinkedHashSet	---------------------//
		Set s1 = new LinkedHashSet();
		s1.add(101);
		s1.add(101);
		s1.add(101);
		System.out.println(s1.add(101));
		s1.add(null);
		s1.add(null);
		System.out.println(s1);


//	------------	TreeSet	---------------------//

		/**
		in next Program
		**/

	}
}
