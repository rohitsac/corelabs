import java.util.*;

class HashSetDemo{
	public static void main(String[] args) {
		Set s = new TreeSet(new MyComp());
		s.add(101);
		s.add(101);
		s.add(101);
		System.out.println(s);

	}
}

class MyComp implements Comparator{
	public int compare(Object o1, Object o2){
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;

		return +1;
	}

}