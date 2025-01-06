public class Primitive {
    public static void main(String[] args) {
        long max = 3123456789L;
        System.out.println(max);

        // Number Systems
        System.out.println(56); // 56
        System.out.println(0b1010); // 10
        System.out.println(017); // 15
        System.out.println(0xFFF); // 4095

        // usage of underscores
        // double notAtStart = _1000.00; // DOES NOT COMPILE
        // double notAtEnd = 1000.00_; // DOES NOT COMPILE
        // double notByDecimal = 1000_.00; // DOES NOT COMPILE
        double annoyingButLegal = 1_00_0.0_0; // this one compiles

        String s = null;
        String b;

        System.out.println(s);
        // System.out.println(b);

    }

    public void findAnswer(boolean check) {
        int answer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
        // System.out.println(onlyOneBranch); // DOES NOT COMPILE
    }

    public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;

        } // bitesOfCheese goes out of scope here
        System.out.println(bitesOfCheese);// DOES NOT COMPILE
    }
}