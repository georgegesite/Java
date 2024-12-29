public class B11 {

    private int num1 = 0;
    private int num2 = 0;

    public static void main(String[] args) {
        B11 bigApp = new B11();
        bigApp.printThis(10, 20);
        bigApp.printThat(30, 40);
    }

    public void printThis(int num1, int num2) {
        num1 = num1;
        num2 = num2;
        System.out.println("num1:" + this.num1 + " num2:" + this.num2);
    }

    public void printThat(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("num1:" + this.num1 + " num2:" + this.num2);
    }
}