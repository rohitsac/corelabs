package gt1;

class MyThrd extends Thread{
	public void run(){
		for(int i=0; i<2; i++){
			System.out.println(i);
		}
	}
}

public class Lab9 {
	public static void main(String[] args) {
		Lab9 l = new Lab9();
		l.check(new MyThrd(){
			
		});
	}
	public void check(MyThrd i){
		i.start();
	}
}
