class Gen<T>{
	T t;
	
	Gen(T t){
		this.t = t;
	}

	public void show(){
		System.out.println(t.getClass().getName());
	}

	public T get(){
		return t;
	}
}


class CustomGen{
	public static void main(String[] args) {
		
		Gen<String> g1 = new Gen<String>("Hello");
		g1.show();
		System.out.println(g1.get());

		Gen<Integer> g2 = new Gen<Integer>(123);
		g2.show();
		System.out.println(g2.get());

		Gen<Double> g3 = new Gen<Double>(123.45);
		g3.show();
		System.out.println(g3.get());

	}
}