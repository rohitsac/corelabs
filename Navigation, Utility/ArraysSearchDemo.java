import java.util.*;

class ArraysSearchDemo{
	public static void main(String[] args) {
		
		int a[] = {10, 50, 30, 15, 8};

		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 6));
		System.out.println(Arrays.binarySearch(a, 14));
		System.out.println("-------------");

		String[] s = {"d", "h", "g", "f", "r"};
		Arrays.sort(s);
		System.out.println(Arrays.binarySearch(s, "Z"));
		System.out.println(Arrays.binarySearch(s, "s"));

		System.out.println("-------------");
		Arrays.sort(s, new myComp());
		System.out.println(Arrays.binarySearch(s, "Z", new myComp()));
		System.out.println(Arrays.binarySearch(s, "s", new myComp()));
		System.out.println(Arrays.binarySearch(s, "N"));	// unpredectible result
	}
}

class myComp implements Comparator{
	public int compare(Object o1, Object o2){
		String s1 = (String)o1;
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}