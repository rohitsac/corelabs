// MyClass.java - Class annotations

@Token(name="Class", code=10)
@Platform(what="Mac")
public class MyClass {
    private String data;
    public MyClass() { }
    public MyClass(String data) { this.data = data; }
    public String read() { return data; }
    public void write(String value, int num) { }
}