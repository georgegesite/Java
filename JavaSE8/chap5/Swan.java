abstract class Animal {
    protected int age;

    public void eat() {
        System.out.println("Animal is eating");
    }

    public abstract String getName(); // abstract method
}

public class Swan extends Animal {
    public String getName() { // abstract method overidden
        return "Swan";
    }

    public static void main(String[] args) {
        // code compiles
    }
}