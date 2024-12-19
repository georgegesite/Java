import java.util.ArrayList;
import java.util.List;

interface Contract {

}

class Super implements Contract {
}

class Sub extends Super {
}

public class A14 {

    public static void main(String[] args) {
        List objects = new ArrayList();
        Contract c1 = new Super();
        Contract c2 = new Sub();
        Super s1 = new Sub();

        objects.add(c1);
        objects.add(c2);
        objects.add(s1);

        for (Object it : objects) {
            System.out.println(it.getClass().getName());
        }
    }
}