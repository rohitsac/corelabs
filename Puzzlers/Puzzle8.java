class Puzzle8{
	public static void main(String[] args) {
		char a = 'A';
		int i = 0;
		System.out.println(true ? a : 0);
		System.out.println(false ? i : a);
	}
}

// Rule 1. If one of the operands is of type T where T is byte, short, or char and the other
// operand is a constant expression of type int whose value is representable in
// type T, the type of the conditional expression is T.
// Rule 2. Otherwise, binary numeric promotion is applied to the operand types, and the
// type of the conditional expression is the promoted type of the second and third
// operands.