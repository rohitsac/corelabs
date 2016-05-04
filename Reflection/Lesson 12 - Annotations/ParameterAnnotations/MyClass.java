// MyClass.java - Parameter annotations

public class MyClass {
    private String data;
    public MyClass() { }
    public MyClass(
        @Token(name="Constructor Parameter", code=50)
        @Platform(what="Mac")
        String data) { this.data = data; }
    public String read() { return data; }
    public void write(
        @Token(name="Method Parameter", code=50)
        @Platform(what="Mac")
        String value,
        @Token(name="Method Parameter", code=50)
        int num) { }
}