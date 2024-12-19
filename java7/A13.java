public class A13 {

    public static void main(String[] args) {
        int number = 5;
        int sum;
        do {
            sum += number;
        } while ((number--) > 1);
        System.out.println("The sum is " + sum + ".");
    }
}