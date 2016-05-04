class Puzzle4{
	public static void main(String[] args) {
		System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));
		System.out.println(Long.toHexString(0x100000000L));
		System.out.println(0xcafebabe);
		System.out.println("................");
		System.out.println(Long.toHexString(0x100000000L + 0xcafebabeL));
	}
}