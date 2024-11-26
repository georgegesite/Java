abstract class InterfaceReference {

    public abstract void doSomething();

}

class x extends InterfaceReference {
    public void doSomething() {
        System.out.println("CLass X");
    }
}

public class y extends InterfaceReference {
    public void doSomething() {
        System.out.println("Class Y");
    }

    public static void main(String[] args) {
        InterfaceReference ref = new x();
        InterfaceReference ref2 = new y();
        ref.doSomething();
        ref2.doSomething();
    }
}
