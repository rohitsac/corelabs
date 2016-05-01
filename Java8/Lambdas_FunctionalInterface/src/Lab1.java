//	without Lambda Expression

public interface Lab1{
	
	public void methodOne();

	public class Demo implements Lab1{
		@Override
		public void methodOne() {
			System.out.println("methodOne()...executingggggg");
		}
	}
	
	public class Test{
		public static void main(String[] args) {
			Lab1 obj = new Demo();
			obj.methodOne();
		}
	}
	
}