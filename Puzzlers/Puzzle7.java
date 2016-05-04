class Puzzle7{
	public static void main(String[] args) {
		int x = 1984; // (0x7c0)
		int y = 2001; // (0x7d1)
		x ^= y ^= x ^= y;
		System.out.println("x = " + x + "; y = " + y);
	}
}


// The actual behavior of x ^= y ^= x ^= y in Java
// int tmp1 = x; // First appearance of x in the expression
// int tmp2 = y; // First appearance of y
// int tmp3 = x ^ y; // Compute x ^ y
// x = tmp3; // Last assignment: Store x ^ y in x
// y = tmp2 ^ tmp3; // 2nd assignment: Store original x value in y
// x = tmp1 ^ y; // First assignment: Store 0 in x