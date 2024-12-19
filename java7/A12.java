public class A12 {

    public static void main(String[] args) {
        int row = 10;
        for (; row > 0;) {
            int col = row;
            while (col >= 0) {
                System.out.print(col + "");
                col -= 2;
            }
            row = row / col;
        }
    }
}