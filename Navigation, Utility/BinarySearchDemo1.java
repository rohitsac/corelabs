import java.util.*;

class BinarySearchDemo1{
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		l.add("a");

		System.out.println(l);
		// Collections.sort(l);
		System.out.println(l);

		System.out.println(Collections.binarySearch(l, "Z"));
		System.out.println(Collections.binarySearch(l, "C"));

	}
}



/**
While applying BinarySearch(), the list must be sorted. (Video 17)
Otherwise we'll get unexpected results.
Successful search returns index, and unsuccessful search returns insertion point.
insertion point is the place where we can place the element.
index starts from 0 and insertion point starts from -1.
if the list is not sorted we can't predict the insertion point.

public static int binarySearch(List l, Object target)
**/