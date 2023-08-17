import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args){
        try (// Scanner scan = new Scanner(System.in);
                // String txt = scan.next();
                // System.out.println(txt);
        Scanner scan = new Scanner(System.in)) {
            boolean present = scan.nextBoolean();
            if (present){
                System.out.println("im present");
            }
            else{
                System.out.println("not present");
            }
        }
        
    }
}
