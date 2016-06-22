import java.math.*;

class Test20{
	public static void main(String[] args) {
		double d = 1.10 - 1.00;
		if(d == 0.10)
			System.out.println("Hello");
		else
			System.out.println("Hi");

		System.out.println(d);

		BigDecimal b = new BigDecimal("1.10").subtract(new BigDecimal("1.0"));
		System.out.println(b);
	}
}