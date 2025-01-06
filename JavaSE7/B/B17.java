public class B17 {

    public static void main(String[] args) {
        String names[] = new String[3];
        names[0] = "Clint Ramirez";
        names[1] = "Nancy Red";
        names[2] = "Jords Erick";

        try {

            for (String n : names) {
                try {
                    String pwd = n.substring(0, 4) + n.substring(6, 10);
                    System.out.println(pwd);
                } catch (StringIndexOutOfBoundsException sie) {
                    System.out.println("String out of limits");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }
}