
public class B10 {

    public static void main(String[] args) {
        String names[] = new String[5];
        names[0] = "Green Apple";
        names[1] = "Puple Grapes";
        names[2] = "Yellow Lemon";
        names[3] = "Orange Mango";
        names[4] = "Brown Chiko";

        for (String n : names) {
            String pwd = n.substring(0, 3) + n.substring(7, 10);
            System.out.println(pwd);
        }
    }
}