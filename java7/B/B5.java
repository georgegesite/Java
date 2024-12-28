import java.util.ArrayList;
import java.util.List;

class Passion {
    String fname;

    public Passion(String name) {
        this.fname = fname;
    }
}

public class B5 {

    public static void main(String[] args) {
        List<Passion> ps = new ArrayList<>();
        Passion pp = new Passion("Alex");
        ps.add(pp);

        // int x = ps.indexOf(new Passion("Alex"));
        // or
        int x = ps.indexOf(pp);
        if (x >= 0) {
            System.out.println("Alex is found");
        }
    }
}