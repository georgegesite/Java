class Caller {
    public static void call() {
        System.out.println("Called");
    }
}

public class A26 {

    public static void main(String[] args) {

        new Caller.call();

        // call(); // cannot find symbol - symbol: method call()

        // Caller.call();

        // Caller c;
        // c.call(); //variable c might not have been initialized

        // Caller().call(); //error: cannot find symbol - symbol: method Caller()
    }
}