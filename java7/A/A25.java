public class A25 {

    public static void main(String[] args) {
        int array1[] = { 1, 2, 3, 4 };
        int array2[] = { 5, 6, 7, 8, 9, 10 };
        array2 = array1;
        for (int e : array2) {
            System.out.print(e + " ");
        }
    }
}