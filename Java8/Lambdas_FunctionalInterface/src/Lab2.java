//	Lab1 with Lambda Expression

@FunctionalInterface
public interface Lab2{
	
	public void methodOne();
	
	public class Test{
		public static void main(String[] args) {
			Lab2 obj = () -> System.out.println("methodOne()...executing Again");
			obj.methodOne();
		}
	}
	
}