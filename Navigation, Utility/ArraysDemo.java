import java.util.*;

class ArraysDemo{
	public static void main(String[] args) {
		
		int a[] = {10, 50, 30, 15, 8};
		System.out.println("before sorting.....");
		for(int i : a)
			System.out.println(i);

		System.out.println("\nAfter sorting.....");
		Arrays.sort(a);
		for(int i : a)
			System.out.println(i);

		System.out.println("\nBefore sorting.....");
		String[] s = {"df", "hu", "ghjk", "fty", "rtfa"};
		for(String i : s)
			System.out.println(i);

		System.out.println("\nAfter sorting.....");
		Arrays.sort(s);
		for(String i : s)
			System.out.println(i);

		System.out.println("\nAfter Customized sorting.....");
		Arrays.sort(s, new myComp());
		for(String i : s)
			System.out.println(i);

	}
}

class myComp implements Comparator{
	public int compare(Object o1, Object o2){
		String s1 = (String)o1;
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}