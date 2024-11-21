public class Testing {

    public final static void main(String[] args) {
        Object a = new Object();
        String s = new String();
        String x = new String();
        String y = s;
        int b = 10;

        System.out.println(a ==s );
        System.out.println(s == x);
        System.out.println(s == y);
        // System.out.println(a == b);
    
    }
}