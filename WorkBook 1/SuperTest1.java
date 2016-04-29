class Super {
    static { System.out.println("Super "); }
    Super(){
    	System.out.println("super cons.....");
    }
}

class One {
    static { System.out.println("One "); }
    One(){
    	System.out.println("one cons");
    }
}

class Two extends Super {
    static { System.out.println("Two "); }
    Two(){
    	System.out.println("Two cons.....");
    }
}


class SuperTest1 {
    public static void main(String[] args) {
        One o = null;
        Two t = new Two();
        System.out.println((Object)o == (Object)t);
    }
}

/*
	The class One is never initialized, because it not used actively and therefore is never linked to. The class Two is initialized only after its superclass Super has been initialized.
*/