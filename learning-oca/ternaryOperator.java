/**
 * ternaryOperator
 */
public class ternaryOperator {

    public static void main(String[] args) {
        System.out.println((y > 5) ? 21 : "Zebra");
        int animal = (y < 91) ? 9 : "Horse"; // DOES NOT COMPILE Error: string cannot be converted to int
    }
}