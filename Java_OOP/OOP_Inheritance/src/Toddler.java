// Toddler Inherits the attributes and methods of Person
class Toddler extends Person {
    private String favoriteToy;

    public Toddler(String fullName, int age, String favoriteToy) {
        super(fullName, age); // Call the constructor of the parent class
        this.favoriteToy = favoriteToy;
    }


    public void play() {
        System.out.println("Toddler is playing with " + favoriteToy);
    }

    public void introduce() {
        super.introduce();
         System.out.println("Toddler is playing with " + favoriteToy);
    }
}