/**
 * IncrementOperator
 */
public class IncrementOperator {

    public static void main(String[] args) {
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);

        long t = 123;
        System.out.println(t);
    }
}