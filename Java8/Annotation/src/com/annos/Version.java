
package com.annos;

/*	It differs from an interface definition only in one aspect: it uses the @ sign before its name */
// this is simple annotation declaration.
public @ interface Version {	// space can be placed b/w @ and interface
	int major();
	int minor() default 0+9;
}

//	The simple name of your annotation type is Version and its fully qualified name is com.annos.Version.
