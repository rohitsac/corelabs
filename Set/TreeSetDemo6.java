//	Adding String & StringBuffer Object to TreeSet, which are non- comparable.
//	And sort them according to increasing lenth.
import java.util.*;

class TreeSetDemo6{
	public static void main(String[] args) {
		
		// TreeSet t = new TreeSet();
		TreeSet t = new TreeSet(new MyComp());
		t.add("Ab");
		t.add("A");
		t.add(new StringBuffer("Abc"));
		t.add(new StringBuffer("Zqwe"));
		t.add(new StringBuffer("Dpo"));

		System.out.println(t);

	}
}

class MyComp implements Comparator{
	public int compare(Object o1, Object o2){
		String s1 = o1.toString();
		String s2 = o2.toString();

		int l1 = s1.length();
		int l2 = s2.length();

		if(l1 < l2)
			return -1;
		if(l1 > l2)
			return +1;
		return s1.compareTo(s2);
	}

}
