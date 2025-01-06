class Apple {
    public void doDef() {
        System.out.println("Red Apple");
    }
}

interface Mango {
    public void doDef();
}

class Orange extends Apple implements Mango {
    public void doDef() {
        System.out.println("Orange Sun");
    }
}

public class B7 {

    public static void main(String[] args) {
        Orange frt2 = new Orange();
        Apple frt3 = frt2;
        ((Orange) frt3).doDef();
        ((Apple) frt2).doDef();
        ((Mango) frt2).doDef();
    }
}