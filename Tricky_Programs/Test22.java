import java.util.*;

class Test22{
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();

		for(int i=0; i<100; i++)
			s.add(randomInteger());

		System.out.println(s.size());
		System.out.println(s);

		Random r = new Random(12345678L);
		System.out.println(r.nextInt());
	}

	private static Integer randomInteger(){
		// return new Random(12345678L).nextInt();
		return new Random().nextInt();
	}
}