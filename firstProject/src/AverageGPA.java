import java.util.Scanner;

public class AverageGPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double[] grades = new double[numSubjects];
        String[] letterGrades = new String[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the grade for subject " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();

            if (grades[i] >= 90) {
                letterGrades[i] = "A";
            } else if (grades[i] >= 80) {
                letterGrades[i] = "B";
            } else if (grades[i] >= 70) {
                letterGrades[i] = "C";
            } else if (grades[i] >= 60) {
                letterGrades[i] = "D";
            } else {
                letterGrades[i] = "F";
            }
        }

        double totalGradePoints = 0;
        for (int i = 0; i < numSubjects; i++) {
            if (letterGrades[i].equals("A")) {
                totalGradePoints += 4.0;
            } else if (letterGrades[i].equals("B")) {
                totalGradePoints += 3.0;
            } else if (letterGrades[i].equals("C")) {
                totalGradePoints += 2.0;
            } else if (letterGrades[i].equals("D")) {
                totalGradePoints += 1.0;
            }
        }

        double averageGPA = totalGradePoints / numSubjects;
        System.out.println("Average GPA: " + averageGPA);

        scanner.close();
    }
}
