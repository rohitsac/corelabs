package gt1;

class ClassA{
	private int i = 7;
	class ClassB{
		public void print(){
			System.out.println("it's : "+i);
		}
	}
}

public class Lab10 {
	public static void main(String[] args) {
		ClassA a = new ClassA();
		ClassA.ClassB inn = a.new ClassB();
		inn.print();
	}
}
