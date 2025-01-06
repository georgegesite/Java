
public class OrderDriver {
    public static void main(String[] args) {
        System.out.print(Order.result + " "); // u
        System.out.print(Order.result + " "); // u
        new Order();// ucr
        new Order();// ucrcr
        System.out.print(Order.result + " ");// ucrcr
        // u u ucrcr
    }
}
