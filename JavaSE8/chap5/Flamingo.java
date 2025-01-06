abstract class Animal {
    public abstract String getName();
}

class Bird extends Animal { // DOES NOT COMPILE
    public String getName() {
        return "Animal";
    }
}

public class Flamingo extends Bird {
    public String getName() {
        return "Flamingo";
    }

    public Flamingo()
    {
        System.out.println(this.getName());
        System.out.println(super.getName());
    }

    public static void main(String[] args) {
        Flamingo flamingo = new Flamingo();
        System.out.println("Compiled Sucessfully");
    }
}