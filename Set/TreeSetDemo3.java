import java.util.*;

class TreeSetDemo3{
	public static void main(String[] args) {
		
		// TreeSet t = new TreeSet();
		TreeSet t = new TreeSet(new MyComp());
		t.add(02);
		t.add(50);
		t.add(10);
		t.add(30);
		t.add(25);
		t.add(10);
		t.add(15);

		System.out.println(t);

	}
}

class MyComp implements Comparator{
	public int compare(Object o1, Object o2){
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;

		// return i1.compareTo(i2);
		// return -i1.compareTo(i2);

		// return i2.compareTo(i1);
		// return -i2.compareTo(i1);

		// return +1;
		// return -1;
		// return 0;
	}

}









/*
	first()
	last()
	headSet()
	tailSet()
	subSet()
	comparator()
*/