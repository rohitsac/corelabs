//	processing by sorted() method.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lab5 {
	public static void main(String[] args) {
		
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("df");	l1.add("xdfdfbvc");	l1.add("qwdfgf");	l1.add("dfer");
		l1.add("podf");	l1.add("vbnvcdf");	l1.add("hkyutdf");	l1.add("jkluidf");
		
		System.out.println(l1);

		//	Default Sorting
		List<String> l2 = l1.stream().sorted().collect(Collectors.toList());
		System.out.println(l2);

		//	Customized sorting using Comparator.
		List<String> l3 = l1.stream().sorted((s1, s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(l3);

		
	}
}
