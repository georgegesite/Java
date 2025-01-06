public class CheckEquality {

    public static void main(String[] args) {
        Integer i1 = 1;
        Integer i2 = new Integer(1);
        // Integer i2 = 1;
        int i3 = 1;
        Byte b1 = 1;
        byte b2 = 1;
        Long g1 = 1L;

        System.out.println(i1 == i2); // false
        System.out.println(i1 == i3); // true
        System.out.println(b1 == b2); // true
        // System.out.println(i1 == b1); //will not compile
        System.out.println(i1.equals(i2)); // true
        System.out.println(i1.equals(g1)); // falsej
        System.out.println(i1.equals(b1)); // false
    }
}