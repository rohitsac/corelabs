import java.util.*;

class CollectionSortDemo2{
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");

		System.out.println("before sorting : \n"+l);
		Collections.sort(l, new MyComp());
		System.out.println("after sorting : \n"+l);
	}
}

class MyComp implements Comparator{
	public int compare(Object o1, Object o2){
		String s1 = (String)o1;
		String s2 = o2.toString();

		return -s1.compareTo(s2);
	}
}