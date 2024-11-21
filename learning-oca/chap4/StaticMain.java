class Koala {
    public static int count = 0; // static variable

    public static void main(String[] args) { // static method
        System.out.println(count);
    }
}

public class StaticMain {
    public static void main(String[] args) {
        Koala.main(new String[0]); // call static method
        // Prints count = 0

        StringBuilder name = new StringBuilder("HEllo");
        speak(name);
        System.out.println(name); // Webby
    }

    public static void speak(StringBuilder s) {
        s.append("Webby"); // method merely calls a method on theparameter
    }
}