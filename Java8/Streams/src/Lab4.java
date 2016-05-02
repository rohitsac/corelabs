//	processing by count() method.

import java.util.ArrayList;

public class Lab4 {
	public static void main(String[] args) {
		
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("df");	l1.add("xdfdfbvc");	l1.add("qwdfgf");	l1.add("dfer");
		l1.add("podf");	l1.add("vbnvcdf");	l1.add("hkyutdf");	l1.add("jkluidf");
		
		System.out.println(l1);

		
		long count = l1.stream().filter(s -> s.length()==7).count();

		System.out.println(count);
		
	}
}
