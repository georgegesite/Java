/* Order of Initialization
Fields and instance initializer blocks are run in the order in which they appear in the file.
The constructor runs after all fields and instance initializer blocks have run.*/
public class Egg {
    public Egg() {
    }

    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.number);
        System.out.println(Integer.MAX_VALUE);
    }

    private int number = 3;
    {
        number = 4;
    }
}