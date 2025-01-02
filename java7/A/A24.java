public class A24 {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Duke");
        String str1 = sb1.toString();

        String str2 = str1;

        // String str2 = sb1.toString();
        System.out.println(str1 == str2);
    }
}

// https://www.freecram.net/question/Oracle.1z0-803.v2018-04-13.q200/given-exhibit-which-code-fragment-when-inserted-at-line-9-enables-the-code-to-print-true