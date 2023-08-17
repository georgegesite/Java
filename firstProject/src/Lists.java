import java.util.ArrayList;

public class Lists {
    public static void main(String[] args){
        
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apples");
        fruits.add("Bannana");
        fruits.add("Oranges");
        fruits.add("Strawberries");
        fruits.add("Raspberries");
        fruits.add("Mangoes");
        System.out.println(fruits.size());
        System.out.println(fruits);
        // remove element from list using index number
        fruits.remove(2);// removes the third fruit in the arraylist
        System.out.println("\nAfter removing an item at 3rd position: " +fruits);
        
        fruits.set(0, "Pineapples");
        System.out.println("\nAfter changing an item at 1st position: " +fruits);
        fruits.clear();
        System.out.println(fruits);

    }
}
