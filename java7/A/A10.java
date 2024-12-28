
public class A10 extends Root {

    public static void main(String[] args) {
        Root r = new A10();
        System.out.println(r.method1());
        System.out.println(r.method2());
    }
}

class Root {
    private static final int MAX = 20000;

    private int method1() {
        int a = 100 + MAX;
        return a;
    }

    protected int method2() {
        int a = 200 + MAX;
        return a;
    }
}