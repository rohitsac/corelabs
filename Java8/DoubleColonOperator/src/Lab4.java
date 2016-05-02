//	Constructor references.

class Sample{
	private String s;
	public Sample(String s) {
		this.s = s;
		System.out.println("Constructor executed : "+s);
	}
}

interface interf{
	public Sample get(String s);
}

public class Lab4 {

	public static void main(String[] args) {

		interf f = s -> new Sample(s);
		f.get("from Lambda Expression");
		
		interf f1 = Sample::new;
		f1.get("from constructor reference");
	}
}
