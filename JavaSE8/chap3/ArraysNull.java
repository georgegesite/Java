package chap3;

public class ArraysNull {
    public static void main(String[] args) {
        int[] var1 = null;
        for (int var2 : var1) {
            System.out.println(var2); // throws NullPointerException
        }
    }
}