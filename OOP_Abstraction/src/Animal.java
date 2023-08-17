abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound(); // Abstract method

    public void introduce() {
        System.out.println("Hi, I'm " + name);
    }
}