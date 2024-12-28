public class A20 {

    public static void main(String[] args) {
        StringBuilder msg = new StringBuilder("hello java!");
        int pos = 0;
        try {
            for (pos = 0; pos < 12; pos++) {
                switch (msg.charAt(pos)) {
                    case 'a':
                    case 'e':
                    case 'o':
                        String uc = Character.toString(msg.charAt(pos)).toUpperCase();
                        msg.replace(pos, pos + 1, uc);
                }
            }
        } catch (Exception e) {
            System.out.println("Out of limits");
        }
        System.out.println(msg);
    }
}