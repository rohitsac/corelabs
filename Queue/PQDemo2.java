import java.util.*;

class PQDemo2{
	public static void main(String[] args) {
		
		PriorityQueue q = new PriorityQueue(15, new MyComp());
		
		q.offer("X");
		q.offer("D");
		q.offer("Q");
		q.offer("B");
		System.out.println(q);


	}
}

class MyComp implements Comparator{
	public int compare(Object o1, Object o2){
		String s1 = o1.toString();
		String s2 = (String)o2;

		// return s1.compareTo(s2);
		return -s1.compareTo(s2);
	}
}