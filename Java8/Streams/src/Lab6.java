//	processing by min() and max() methods.

import java.util.ArrayList;

public class Lab6 {
	public static void main(String[] args) {
		
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("df");	l1.add("xdfdfbvc");	l1.add("qwdfgf");	l1.add("dfer");
		l1.add("podf");	l1.add("vbnvcdf");	l1.add("hkyutdf");	l1.add("jkluidf");
		
		System.out.println(l1);

		//	min by Comparator
		String min = l1.stream().min((s1, s2) -> s1.compareTo(s2)).get();
		System.out.println(min);

		//	max by Comparator
		String max = l1.stream().max((s1, s2) -> s1.compareTo(s2)).get();
		System.out.println(max);

	}
}
