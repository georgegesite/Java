public class Example {

    public static void main(String[] args) {
        System.out.print("A");
        try {
            System.out.print("B");
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.print("C");
            throw e;
        } finally {
            System.out.print("D");
        }
        System.out.print("E");
        
    }
}