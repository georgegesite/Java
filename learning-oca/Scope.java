public class Scope {
    public static void main(String[] args) {
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two; // String object "a" okay for gc
        String three = one;
        one = null;
    }// String object "b" okay for gc
}