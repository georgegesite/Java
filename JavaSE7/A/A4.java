
public class A4 {

    public static void main(String[] args) {
        float k = (123_345.01 >= 123_45.00) ? 12_456 : 12_456.02f;
        float j = k + 1024;
        System.out.println(j);
    }
}