class DynamicDispatchDemo{
	public static void main(String[] args) {
		Person p = null;
		p = new Student();
		p.eating();
		p.walking();
		p.sleeping();
		// p.reading();			//	error
		Student s = (Student)p;
		s.reading();

		System.out.println("*****************");

		p = new Employee();
		p.eating();
		p.walking();
		p.sleeping();
		// p.working();			//	error
		Employee e = (Employee)p;
		e.working();

		System.out.println("*****************");




	}
}