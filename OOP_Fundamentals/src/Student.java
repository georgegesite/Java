public class Student {
    String firstName;
    String lastName;
    int year;
    String course;
    String section;
    double midtermGrade;
    double finalGrade;

    // Constructor
    public Student(String firstName, String lastName, int year, String course, String section,
                   double midtermGrade, double finalGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.course = course;
        this.section = section;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
    }

    // Method to calculate overall grade
    public double calculateOverallGrade() {
        return (midtermGrade + finalGrade) / 2;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Year: " + year);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);
        System.out.println("Midterm Grade: " + midtermGrade);
        System.out.println("Final Grade: " + finalGrade);
        System.out.println("Overall Grade: " + calculateOverallGrade());
    }

}
