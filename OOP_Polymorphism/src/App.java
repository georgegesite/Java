public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Animal animal = new Animal();
        animal.makeSound();
        Animal dog = new Dog();
        dog.makeSound();
        Animal cat = new Cat();
        cat.makeSound();
    }
}
