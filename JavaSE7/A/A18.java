public class A18 {

    public static void main(String[] args) {
        int x = 0;
        int[] a = { 2, 3, 4, 5, 6 };
        do {
            if (a[x] % 2 == 0) {
                System.out.print(a[x] + " ");
            }
        } while (x++ < 2);
    }
}