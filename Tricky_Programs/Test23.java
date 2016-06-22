class Test23{
	// public static void main(String[] args) {
	public static void main(java.lang.String[] args) {
		String s = new String("Hello");
		System.out.println(s);
	}
}

class String{
	java.lang.String s;

	public String(java.lang.String s){
		this.s = s;
	}

	public java.lang.String toString(){
		return s;
	}	

}