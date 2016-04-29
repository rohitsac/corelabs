public class App {
    public int sum(int a, int b) {
    	int sum = a+b;
    	return sum;
    }
    
    public static void main(String[] args) {
		App a = new App();
		a.sum(10, 20);
	}
}