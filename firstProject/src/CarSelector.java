import java.util.Scanner;
public class CarSelector {
    public static void main(String[] args){
        System.out.println("Do you want a car?");
        Scanner scan = new Scanner(System.in);
        String Answer = scan.next();

        if(Answer.equals("yes"))
        {
            System.out.println("What color would you like?");
        }
        else{
            System.out.println("Okay Thank you");
        }
    }
}
