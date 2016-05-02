//	write a Predicate function to check if integer is greater than 10.

import java.util.function.Predicate;

public class Lab1 {
	public static void main(String[] args) {
		Predicate<Integer> p = i -> (i>10);
		System.out.println(p.test(1010));
		System.out.println(p.test(10));
		System.out.println(p.test(1));
//		System.out.println(p.test(true));
	}
}
