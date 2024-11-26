public class Strings {

    public static void main(String[] args) {
        // String s = "hell";
        // StringBuilder sb = new StringBuilder("well");
        // sb.append("o");

        // System.out.println(s + sb);

        // String word = "Fluffy";
        // String word2 = new String("Fluffy");
        // String word3 = "Fluffy";

        // System.out.println(word == word2);
        // System.out.println(word.equals(word2));
        // System.out.println(word == word3);

        // System.out.println("Hello" + 2 + '1' + false + true);

        StringBuilder sb1 = new StringBuilder("Duke");
        String sb2 = sb1.toString();
        String duke = "Duke";
        String sb3 = sb2;

        System.out.println(sb2.equals(sb3));
        System.out.println(sb2.equals(duke));
        System.out.println(sb2.equals("Duke"));
    }
}