import java.util.*;

class demoo{
	
	public void m1(ArrayList<String> al){
		System.out.println("String....");
	}

	public void m2(ArrayList<?> al){
		System.out.println("? ....");
	}

	public void m3(ArrayList<? extends Number> al){
		System.out.println("? extends Number....");
	}

	public void m4(ArrayList<? super Runnable> al){
		System.out.println("? super Runnable....");
	}
}


class GenericMethodDemo{
	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>();
		ArrayList<?> al2 = new ArrayList<>();
		ArrayList<? extends Number> al3 = new ArrayList<>();
		ArrayList<? super Runnable> al4 = new ArrayList<>();
		ArrayList<? super Runnable> al4_ = new ArrayList<Object>();

		demoo d = new demoo();
		d.m1(al1);
		d.m2(al2);
		d.m3(al3);
		d.m4(al4);
		d.m4(al4_);

	}
}