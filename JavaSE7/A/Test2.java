// A31

public class Test2 {
    int fvar;
    static int cvar;

    public static void main(String[] args) {
        Test2 t = new Test2();
        // t.fvar = 200;
        // Test2.cvar = 400;

        t.fvar = 200;
        t.cvar = 400;

        // fvar = 200; //error: non-static variable fvar cannot be referenced from a
        // static context
        // cvar = 400;

        // this.fvar = 200; //non-static variable fvar cannot be referenced from a
        // this.cvar = 400;//non-static variable fvar cannot be referenced from a

        // this.fvar = 200; //non-static variable fvar cannot be referenced from a
        // Test2.cvar = 200;

    }
}