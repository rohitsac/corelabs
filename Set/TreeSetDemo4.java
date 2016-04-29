//	Adding duplicate elements to Set

import java.util.*;

class TreeSetDemo4{
	public static void main(String[] args) {
		
		// TreeSet t = new TreeSet();
		TreeSet t = new TreeSet(new MyComp());
		t.add(10);
		t.add(10);
		t.add(10);
		t.add(10);

		System.out.println(t);

	}
}

class MyComp implements Comparator{
	public int compare(Object o1, Object o2){
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;

		return +1;
	}

}
