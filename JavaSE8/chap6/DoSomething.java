public class DoSomething {
    public void go() {
        System.out.print("A");
        try {
            stop();
        } catch (ArithmeticException e) { // Does not catch NUllPointerException
            System.out.print("B");
        } finally {
            System.out.print("C"); // Executes regardless if it catches exception or not
        }
        System.out.print("D");
    }

    public void stop() {
        System.out.print("E");
        Object x = null;
        x.toString(); // Throws NulllPointerException
        System.out.print("F");
    }

    public static void main(String[] args) {
        try {
            new DoSomething().go(); // Outputs AEC
        } catch (RuntimeException e) {
            // TODO: handle exception
            System.out.println("G");
        }

    }
}