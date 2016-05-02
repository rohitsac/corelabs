
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AllinOne {
	public static void main(String[] args) {

		ArrayList<Integer> l1 = new ArrayList<>();

		l1.add(0);
		l1.add(20);
		l1.add(25);
		l1.add(03);
		l1.add(40);
		l1.add(10);
		l1.add(15);
		l1.add(01);

		System.out.println(l1);

		System.out.println("---------- l2 ----------");
		// ArrayList<Integer> l2 = l1.stream().map(i ->
		// i+10).collect(Collectors.toList()); // compilation Error
		// ArrayList<Integer> l2 = (ArrayList<Integer>) l1.stream().map(i ->
		// i+10).collect(Collectors.toList());
		List<Integer> l2 = l1.stream().map(i -> i + 10).collect(Collectors.toList());
		System.out.println(l2);

		System.out.println("---------- count ----------");
		long count = l1.stream().filter(i -> i % 2 == 0).count();
		System.out.println(count);

		System.out.println("---------- l3 ----------");
		List<Integer> l3 = l1.stream().sorted().collect(Collectors.toList());
		System.out.println(l3);

		System.out.println("---------- l4 ----------");
		Comparator<Integer> comp = (i1, i2) -> i1.compareTo(i2);
		List<Integer> l4 = l1.stream().sorted(comp).collect(Collectors.toList());
		System.out.println(l4);

		System.out.println("---------- min ----------");
		Integer min = l1.stream().min(comp).get();
		System.out.println(min);

		System.out.println("---------- max ----------");
		Integer max = l1.stream().max(comp).get();
		System.out.println(max);

		System.out.println("---------- forEach Lambda Expression ----------");
		l3.stream().forEach(i -> System.out.println(i));
		
		System.out.println("---------- forEach :: Operator ----------");
		l3.stream().forEach(System.out::println);

	}
}
