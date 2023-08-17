public class App {
    public static void main(String[] args) throws Exception {

        Toddler toddler = new Toddler("Alice Smith", 2, "Teddy Bear");
        toddler.introduce(); // Call method from the Person class (inherited)
        // toddler.play();   
        Kid kid = new Kid("George", 22, "XBOX", 5);
        kid.introduce();
    }
}
