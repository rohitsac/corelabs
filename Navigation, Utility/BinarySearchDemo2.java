import java.util.*;

class BinarySearchDemo2{
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		l.add("a");

		System.out.println(l);
		// Collections.sort(l);
		Collections.sort(l, new MyComp());
		System.out.println(l);

		System.out.println(Collections.binarySearch(l, "Z"));
		System.out.println(Collections.binarySearch(l, "C"));

		System.out.println(Collections.binarySearch(l, "Z", new MyComp()));
		System.out.println(Collections.binarySearch(l, "C", new MyComp()));

	}
}

class MyComp implements Comparator{
	public int compare(Object o1, Object o2){
		String s1 = o1.toString();
		String s2 = o2.toString();

		return -s1.compareTo(s2);
	}
}