interface interf{
//	default int hashCode(){}
	
	int hashCode();
}

/**
 * 	we can't override Object class methods as default methods inside interface bcoz
 * 	Object class methods are already available to evary java class hence it is not
 *  required to bring through default methods.
 */
	