public class B23 {

    public static void main(String[] args) {
        B23 tf = new B23();
        System.out.print(isAvail + " ");
        isAvail = tf.doStuff();
        System.out.println(isAvail);
    }

    public static boolean doStuff() {
        return !isAvail;
    }

    static boolean isAvail = false;
}