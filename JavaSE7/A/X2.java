// JAVA SE 7 Programmer Mock Exam Set A
// 2 

public class X2 implements C {
    public String toString() {
        return " ";
    }

    public static void main(String[] args) {
        B myB = new B(); // Step 1: Create an object of class B.
        X2 myX2 = myB; // Step 2: Implicit upcasting (B is-a X2).
        C myC = myX2; // Step 3: Implicit upcasting (X2 implements C).

        System.out.println(myX2); // Invokes B's toString(), output: "B"
        System.out.println((B) myX2); // Casts myX2 to B, still outputs: "B"
        System.out.println(myC); // Invokes B's toString(), output: "B"
    }

}

class B extends X2 {
    public String toString() {
        return "B";
    }
}

interface C {
}
