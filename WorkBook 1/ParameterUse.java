public class ParameterUse {
	public static void main(String[] args) {
	int a = 0;
	final int b = 1;
	int[] c = { 2 };
	final int[] d = { 3 };
	useArgs(a, b, c, d);
}

static void useArgs(final int a, int b, final int[] c, int[] d) {
// INSERT STATEMENT HERE.
	b=a;	//	run successfully
	// c = d;	//	error bcoz c is final here
	// a++;		//	error bcoz a is final here
}
}