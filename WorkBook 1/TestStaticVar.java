class TestStaticVar {
    static int x = 1;
    int y = 2;
    public static void main(String[] args) {
        int x = 0;		//	shadowing
        System.out.print(x);
        System.out.println(TestStaticVar.x);
        // System.out.println(this.x);
    }
}