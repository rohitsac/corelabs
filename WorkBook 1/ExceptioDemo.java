class ExceptioDemo{
	public static void main(String[] args) {
		try{
			System.out.println("Hi");
			System.out.println(10/0);
			System.exit(1);
			return;
		}catch(Exception e){
			System.out.println("Hai");
			System.exit(1);
			return;
		}finally{
			System.out.println("Hello");
			return;
		}
	}
}