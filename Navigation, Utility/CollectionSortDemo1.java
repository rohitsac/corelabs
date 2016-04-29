import java.util.*;

class CollectionSortDemo1{
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");

		// l.add(new Integer(10));
		// l.add(null);
		// l.add(null);

		System.out.println("before sorting : \n"+l);
		Collections.sort(l);
		System.out.println("after sorting : \n"+l);
	}
}