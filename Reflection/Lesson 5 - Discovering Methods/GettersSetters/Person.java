// Person.java - class with getters, setters

public class Person {
    private String name;
    private int age;
    private boolean deceased;
    public Person() { }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        deceased = false;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public boolean isDeceased() { return deceased; }
    public void setDeceased(boolean deceased) { this.deceased = deceased; }
    public boolean isTeenager() {
        return (age > 12 && age < 20) ? true : false;
    }
    @Override public String toString() { return name + " " + age; }
}