package predicateJoining;

import java.util.function.Predicate;

public class Lab4 {
	public static void main(String[] args) {
		int[]x = {0, 5, 10, 15, 20, 25};
		Predicate<Integer> p1 = i -> i>10;
		Predicate<Integer> p2 = i -> i%2==0;
		
		System.out.println("The no.s greater than 10 : ");
		m1(p1, x);
		
		System.out.println("The even no.s are : ");
		m1(p2, x);
		
		System.out.println("The no.s NOT greater than 10 : ");
		m1(p1.negate(), x);
		
		System.out.println("The no.s greater than 10 AND even : ");
		m1(p1.and(p2), x);
		
		System.out.println("The no.s greater than 10 OR even : ");
		m1(p1.or(p2), x);
	}

	public static void m1(Predicate<Integer> p, int[] x) {
		for(int x1 : x)
			if(p.test(x1))
				System.out.println(x1);
	}
}
