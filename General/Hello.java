class Hello{
	static char ch;
	
	public static void main(String[] args) {
		System.out.println(ch == 0);
		System.out.println(ch ==' ');
		System.out.println(ch == '\u0000');
		System.out.println(ch == '0');
	}
}