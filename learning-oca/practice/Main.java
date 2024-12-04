class MyClass {
    private String name;

    public MyClass(String name) {
        this.name = name;
    }

    // public String toString() {
    // return "MyClass name: " + name;
    // }
}

public class Main {
    public static void main(String[] args) {
        MyClass myObject = new MyClass("Example");
        System.out.println(myObject); // Automatically calls toString()
    }
}
