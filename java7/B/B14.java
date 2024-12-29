
class A {
    public void msgA() {
        System.out.println("Amsg1");
    }
}

class B extends A {
    public void msgA() {
        System.out.println("Amsg2");
    }

    public void msgB() {
        System.out.println("Msg");
    }
}

public class B14 {

    public static void main(String[] args) {
        A aRef = new B();
        B bRef = (B) aRef;
        bRef.msgB();
        aRef.msgA();

    }
}