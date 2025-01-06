class Mammal {
    public Mammal(int age) {
        System.out.print("Mammal");
    }

    public Mammal() {
        System.out.print("Mammal");
    }
}

public class Platypus extends Mammal {
    public Platypus() {
        System.out.print("Platypus");
    }

    public static void main(String[] args) {
        new Mammal(5); // Creates a Mammal instance
    }
}
