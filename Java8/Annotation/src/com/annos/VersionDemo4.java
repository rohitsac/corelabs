//	A Class Implementing an Annotation Type like an interface.
//	Do not implement an annotation in a class even if it works.
package com.annos;

import java.lang.annotation.Annotation;

@Version(major = 50, minor = 1)
public class VersionDemo4 implements Version{

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int major() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int minor() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
