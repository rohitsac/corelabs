import java.util.*;

class CollectionsDemo1{
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("M");
		l.add("K");
		l.add("a");

		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		System.out.println(Collections.binarySearch(l, "Z"));
		System.out.println(Collections.binarySearch(l, "J"));

		//	for searching list must be sorted, otherwise we'll get
		//	unpredictable results.	

	}

}