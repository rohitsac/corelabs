class Super {
    static int taxi = 1729;
    Super(){
    	System.out.println("super cons.....");
    }
}
class Sub extends Super {
	Sub(){
		System.out.println("sub cons.....");
	}
    static { System.out.print("Sub "); }
}


class SuperTest2 {
    public static void main(String[] args) {
        System.out.println(Sub.taxi);
    }
}