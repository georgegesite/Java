public class Order {
    static String result = "";
    {
        result += "c";
    }
    static {
        result += "u";
        System.out.println("Static initializer ran once");
    }
    {
        result += "r";
    }
}