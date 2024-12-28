public class B2 {
    private boolean res;

    public void displayFeast() {
        int numb = 2;
        while (res) {
            if (numb % 7 == 0) {
                res = false;
                System.out.print(numb);
            }
            numb += 2;
        }
    }

    public static void main(String[] args) {
        new B2().displayFeast();
    }
}
