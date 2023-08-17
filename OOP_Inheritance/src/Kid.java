public class Kid extends Toddler {
    int gradeLevel;
    Kid(String fullName, int age, String favoriteToy, int gradeLevel)
    {
        super(fullName,age,favoriteToy);
        this.gradeLevel = gradeLevel;
    }

    public void introduce() {
        super.introduce();
        System.out.println("Grade Level is " + gradeLevel);
    }
    
}
