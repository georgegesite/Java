public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");
        //abstract classes cannot be instatiated 
        dog.introduce(); // Call method from Animal class
        dog.makeSound(); // Call method from Dog class

        cat.introduce(); // Call method from Animal class
        cat.makeSound(); // Call method from Cat class
    }
}
