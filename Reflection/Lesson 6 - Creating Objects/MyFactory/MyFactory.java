// MyFactory.java - factory method with property files

public class MyFactory {
    public static void main(String[] args) {
        try {
            Dbase db = Factory.createDbase();
            db.write(new Record(100));
            db.read();
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
}

/***********************************************

$ cat Dbase.properties
Dbase=MyDbase

$ java MyFactory
MyDbase: write
MyDbase: read

$ cat Dbase.properties
Dbase=OtherDbase

$ java MyFactory
OtherDbase: write
OtherDbase: read

*/
