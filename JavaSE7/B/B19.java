public class B19 {

    public static void main(String[] args) {
        StringBuilder abc = new StringBuilder("Some content");
        System.out.println("Before clearing: " + abc);

        // Clear the contents
        abc.delete(0, abc.length());

        System.out.println("After clearing: " + abc);

    }
}