import java.util.*;

class ReverseOrderDemo{
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		l.add("a");

		System.out.println(l);
		Collections.sort(l, new MyComp());
		System.out.println(l);
		System.out.println("---------------");

		Comparator comp = Collections.reverseOrder(new MyComp());
		Collections.sort(l, comp);
		System.out.println(l);
	}
}

class MyComp implements Comparator{
	public int compare(Object o1, Object o2){
		String s1 = (String)o1;
		String s2 = o2.toString();

		return -s1.compareTo(s2);
	}
}


/**
we can use reverse() to reverse the order of elements.
And reverseOrder() is used to get reversed comparator.
**/