public class AverageCalculator {
    public static void main(String[] args) {
        // Create an array of numbers
        double[] numbers = { 5.5, 10.0, 7.2, 8.7, 3.1 };

        // Calculate the sum of the numbers
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Calculate the average
        double average = sum / numbers.length;

        // Print the results
        System.out.println("Numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
    }
}