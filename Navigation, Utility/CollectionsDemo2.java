import java.util.*;

class CollectionsDemo2{
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(15);
		l.add(20);
		l.add(78);
		l.add(12);
		l.add(11);

		System.out.println(l);
		Collections.sort(l, new MyComp());
		System.out.println(l);
		System.out.println(Collections.binarySearch(l, 20));	// unpredictable
		System.out.println(Collections.binarySearch(l, 45));	// unpredictable
		System.out.println(Collections.binarySearch(l, 20, new MyComp()));
		System.out.println(Collections.binarySearch(l, 45, new MyComp()));

		//	for searching a customized sorted list must be searched with
		//	comparator reference, otherwise we'll get
		//	unpredictable results.	

	}
}

class MyComp implements Comparator{
	public int compare(Object o1, Object o2){
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		return i2.compareTo(i1);
	}
}