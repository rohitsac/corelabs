import java.util.*;

class GenericsDemo{
	public static void main(String[] args) {
		ArrayList<?> al1 = new ArrayList<>();
		ArrayList<?> al2 = new ArrayList<String>();
		ArrayList<?> al3 = new ArrayList<Number>();
		ArrayList<?> al4 = new ArrayList<Object>();

		ArrayList<? extends Number> al5 = new ArrayList<>();
		ArrayList<? extends Number> al6 = new ArrayList<Integer>();
		// ArrayList<? extends Number> al7 = new ArrayList<String>();

		// ArrayList<?> al = new ArrayList<? extends Number>();

		



	}
}