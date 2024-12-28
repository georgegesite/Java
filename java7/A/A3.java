
public class A3 {
    public static void main(String[] args) {
        String digits = "678_123";
        boolean x = Integer.parseInt(digits) == 678123;
        System.out.println(x);
        // Exception in thread "main" java.lang.NumberFormatException: For input string:
        // "678_123"
    }
}