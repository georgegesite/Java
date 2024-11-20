public class Strings {

    public static void main(String[] args) {
        String s = "hell";
        StringBuilder sb = new StringBuilder("well");
        sb.append("o");

        System.out.println(s + sb);
    }
}