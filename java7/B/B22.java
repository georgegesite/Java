public class B22 {

    public static void main(String[] args) {
        int l, m, n = 0;
        try {
            l = 20;
            m = 0;
            n = l / m;
        } catch (ArithmeticException e) {
            System.out.println("Zero divide error");
        }
        System.out.println("Value of n is " + n);
    }
}