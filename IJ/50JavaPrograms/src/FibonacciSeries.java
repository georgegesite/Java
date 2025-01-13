public class FibonacciSeries {

    public static void main (String... args) {
        System.out.println(fibIteration(5));
        System.out.println(fibRecursion(5));
    }
    // Fibonacci Series using Iteration
    public static long fibIteration (long number) {

        long result = 0;
        long fibonacciZero = 0;
        long fibonacciOne = 1;

        if (number == 1 || number == 2) return 1;

        for (int i = 1 ; i < number ; i++){
            result = fibonacciZero + fibonacciOne;
            fibonacciZero = fibonacciOne;
            fibonacciOne = result;
        }

        return result;

    }

    // Fibonacci Series using Recursion
    public static int fibRecursion(int number){
        if (number == 1 || number == 2) return 1;

        return fibRecursion(number -1 ) + fibRecursion(number -2);
    }
}
