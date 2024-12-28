
public class A5 {

    public static void main(String[] args) {
        String str1 = "Rivan";
        char str2[] = { 'R', 'i', 'v', 'a', 'n' };
        String str3 = null;
        for (char c : str2) {
            str3 = str3 + c;
        }
        if (str1.equals(str3)) { // false
            System.out.println("Successful"); // str3 = nullRivan
        } else {
            System.out.println("Unsuccessful");
        }
    }
}