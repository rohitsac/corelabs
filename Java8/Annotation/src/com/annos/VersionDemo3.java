package com.annos;

@Version(major = 50, minor = 1)
public class VersionDemo3 {
	// for instance variables
	@Version(major = 50, minor = 1)
	int x = 10;
	
	//for constructor
	@Version(major = 50, minor = 1)
	VersionDemo3(){}
	
	//for parameterized constructor
	@Version(major = 50, minor = 1)
	VersionDemo3(int x){
		this.x = x;
	}
	
	//for method
	@Version(major = 50, minor = 1)
	public void meth(){}
	
	//for parameterized method
		@Version(major = 50, minor = 1)
		public void meth(int x){
			//for local variable
			@SuppressWarnings("unused")
			@Version(major = 50, minor = 1)
			int y = 90;
		}
}

/*	 
 * It is to be emphasized that using annotations in your program does not change the behavior of the program at all.

 * The real benefit of annotations comes from reading it during compilation and runtime.

*/