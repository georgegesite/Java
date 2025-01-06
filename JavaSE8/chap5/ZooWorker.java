class Reptile {
    public String getName() {
        return "Reptile";
    }
}

class Alligator extends Reptile {
    public String getName() {
        return "Alligator";
    }
}

class Crocodile extends Reptile {
    public String getName() {
        return "Crocodile";
    }
}

public class ZooWorker {
    public static void feed(Reptile reptile) {
        System.out.println("Feeding reptile " + reptile.getName());
    }

    public static void main(String[] args) {
        feed(new Reptile());
        // able to handle instances of Alligator and Crocodile without issue, because
        // both are subclasses of the Reptile class.
        feed(new Alligator());
        feed(new Crocodile());

    }
}