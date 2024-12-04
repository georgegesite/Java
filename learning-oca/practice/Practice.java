import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        String digits = "678_123";
        // boolean x = Integer.parseInt(digits) == 678123; // NumberFormatException
        // System.out.println(x);

        float k = (8.00 > 9.00) ? 123 : 1.0f;
        float j = k + 123;
        System.out.println(j); // 124.0

        String string = null;
        char[] letters = { 'a', 'b', 'c' };
        // string = letters[1] + letters[2]; //incompatible types: int cannot be
        // converted to String - Result is 98 + 99 = 197
        System.out.println(string);
        string = "" + letters[1] + letters[2]; // acceptable - Concatenation with ""
        System.out.println(string);

        char x = 8; // backspace - assigns a control character (Unicode 8) to x.
        int z = '8';// unicode value of 56 - assigns the Unicode code point of '8' (which is 56) to
                    // z.
        System.out.println(x);
        System.out.println(z);

        // Create an ArrayList of Object type
        ArrayList<Object> mixedList = new ArrayList<>();
        // Add different types of objects
        mixedList.add("Hello, World!"); // String
        mixedList.add(42); // Integer
        mixedList.add(3.14); // Double // Custom class
        // Iterate and print the class name of each object
        for (Object object : mixedList) {
            System.out.println("Class name: " + object.getClass().getName());
        }

        String str = "Hello";
        // System.out.println(str.charAt(5)); // Throws StringIndexOutOfBoundsException

        StringBuilder sb = new StringBuilder("Hello, World!");

        // 1. Using setLength(0) (Preferred)
        sb.setLength(0);

        // 2. Using delete
        sb.delete(0, sb.length());

        // 3. Reinitializing (creates a new instance)
        sb = new StringBuilder();

        System.out.println("After clearing: '" + sb + "'"); // Output: After clearing: ''

        int[] array = { 1, 2, 3 };
        int[] array2 = { 4, 5, 6 };
        array2 = array;
        System.out.println(array);
        System.out.println(array2);

    }
}
