package gt1;

public class Lab18 {
	int student[] = new int[1];
	int i = 9;
	
	public static void main(String[] args) {
		add();
	}
	public static void add(){
		student[0] = 10;
		int result = student[0]+i;
		System.out.println(result);
	}
}
