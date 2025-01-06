import java.io.IOError;

public class B8 {

    public static void main(String[] args) {
        B8 e = new B8();
        try {
            e.doHay();
            e.doHey();
        } catch (Exception e2) {
            System.out.println("Caught " + e2);
        }
    }

    public void doHay() throws Exception {
        throw new Error("Error");
    }

    public void doHey() throws Exception {
        throw new RuntimeException("Exception");
    }
}