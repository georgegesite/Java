public class TestClass {
    public static void main(String args[]) {
        int i;
        int j;
        for (i = 0, j = 0; j < 1; ++j, i++) {
            System.out.println(i + " " + j);
        }
     crazyLoop();

    } 

    public static void crazyLoop() {
        int c = 0;
        JACK: while (c < 8) {
            JILL: System.out.println(c);
            if (c > 3)
                break JACK;
            else
                c++;
        }
    }}

    

    