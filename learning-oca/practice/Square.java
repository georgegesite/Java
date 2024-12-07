public class Square {
    private double side = 0; // LINE 2

    public static void main(String[] args) { // LINE 4
        Square sq = new Square(); // LINE 5
        sq.side = 10; // LINE 6
        System.out.println(sq.side);
    }
}