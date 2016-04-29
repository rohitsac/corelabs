import java.util.*;

class TreeSetDemo2{
	public static void main(String[] args) {
		
		// TreeSet t = new TreeSet();
		TreeSet t = new TreeSet(new MyComp());
		t.add(0);
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

		if(i1 < i2)
			return +1;
		if(i1 > i2)
			return -1;
		return 0;
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