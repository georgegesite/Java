abstract class Animal {
    public abstract String getName();
}

class Bird extends Animal { // DOES NOT COMPILE
    public String getName() {
        return "";
    }
}

public class Flamingo extends Bird {
    public String getName() {
        return "Flamingo";
    }

    public static void main(String[] args) {
        System.out.println("Compiled Sucessfully");
    }
}