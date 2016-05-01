package gt1;

import java.util.LinkedList;
import java.util.Queue;

public class Lab15 {
	public static void main(String[] args) throws Exception{
		Queue<String> q = new LinkedList<>();
		q.add("one");
		q.add("two");
		System.out.println(q.poll());
	}
}
