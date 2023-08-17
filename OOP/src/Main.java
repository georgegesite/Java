import java.util.Scanner;

public class Main {
    public static void main (String [] args)
    {
        // Person p = new Person();
        // // Person p1 = new Person();
        // // Person p2 = new Person();

        // p.firstName = "George";
        // p.lastName ="Gesite";
        // p.age = 22;
        // p.sex ='m';


        // System.out.println(p.firstName);
        // System.out.println(p.lastName);
        // System.out.println(p.age);
        // System.out.println(p.sex);
        
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        float price = scan.nextFloat();

        Product product = new Product(name, price);
        Person person = new Person("George", "Gesite", 'M' , 22);

    }
}
