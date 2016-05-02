/**
 * Processing by forEach() method. 
 * This method will return anything.
 * This method will take lambda Expression as argument and apply that lambda Expression
 * for each element present in the stream.
 */

import java.util.ArrayList;

public class Lab7 {
	public static void main(String[] args) {
		
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("df");	l1.add("xdfdfbvc");	l1.add("qwdfgf");	l1.add("dfer");
		l1.add("podf");	l1.add("vbnvcdf");	l1.add("hkyutdf");	l1.add("jkluidf");
		
		System.out.println(l1);

		System.out.println("-------------------------------");
		l1.stream().forEach(s -> System.out.println(s));	//	Lambda Expression
		
		System.out.println("-------------------------------");
		l1.stream().forEach(System.out :: println);			//	:: Operator
	}
}
