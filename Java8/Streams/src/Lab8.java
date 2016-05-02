/**
 * 	processing by toArray() method.
 * 	we can view a Collection as Array only (Doesn't convert Collection to Array).
 */

import java.util.ArrayList;

public class Lab8 {
	public static void main(String[] args) {
		
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("df");	l1.add("xdfdfbvc");	l1.add("qwdfgf");	l1.add("dfer");
		l1.add("podf");	l1.add("vbnvcdf");	l1.add("hkyutdf");	l1.add("jkluidf");
		
		System.out.println(l1);

//		Integer[] ir = l1.stream().toArray(Integer[] :: new);	//	ArrayStoreException
		String[] sr = l1.stream().toArray(String[] :: new);
		for(String i : sr)
			System.out.println(i);
	}
}
