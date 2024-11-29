interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }

    public void fetch() {
        System.out.println("Fetching ball");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }

    public void scratch() {
        System.out.println("Scratching post");
    }
}

public class AnimalExample {
    public static void main(String[] args) {
        // Upcasting (implicit casting)
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        // Using interface methods
        animal1.makeSound(); // Outputs: Woof!
        animal2.makeSound(); // Outputs: Meow!

        // Downcasting (explicit casting)
        Dog dog = (Dog) animal1;
        dog.fetch(); // Outputs: Fetching ball

        // Print interface reference
        System.out.println(animal1); // Outputs: Dog@<memory_address>
        System.out.println(animal2); // Outputs: Cat@<memory_address>

        // Demonstrating ClassCastException
        try {
            Dog wrongCast = (Dog) animal2; // This will throw ClassCastException
        } catch (ClassCastException e) {
            System.out.println("Cannot cast Cat to Dog!");
        }
    }
}
