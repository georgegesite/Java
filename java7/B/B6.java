
abstract class A {
    public abstract void functionA();
}

interface B {
    public void functionB();
}

abstract public class B6 extends A implements B {

    // public void functionC() {

    // }

    public static void main(String[] args) {
        System.out.println("Working");
    }
}