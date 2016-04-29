//	Adding StringBuffer Object to TreeSet, which is non- comparable.

import java.util.*;

class TreeSetDemo5{
	public static void main(String[] args) {
		
		// TreeSet t = new TreeSet();
		TreeSet t = new TreeSet(new MyComp());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("D"));

		System.out.println(t);

	}
}

class MyComp implements Comparator{
	public int compare(Object o1, Object o2){
		String s1 = o1.toString();
		String s2 = o2.toString();
		// String s2 = (String)o2;

		return -s1.compareTo(s2);
	}

}
