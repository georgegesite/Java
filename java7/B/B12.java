public class B12 {

    public static void main(String[] args) {
        String[] letters = { "ww", "xx", "yy" };
        for (String aa : letters) {
            int jj = 0;
            while (jj < letters.length) {
                System.out.print(aa + ", " + jj);
                jj++;
            }
        }
    }
}