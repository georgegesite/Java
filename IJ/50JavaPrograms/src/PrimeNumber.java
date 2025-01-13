public class PrimeNumber {
    public static void main (String... args){

            int input = 2;
            System.out.println(isPrime(input));
    }

    public static boolean isPrime (int number ){

        if ( number < 2 ) return false;
        int counter = 0;

        for (int i = 1; i <= number; i++){
            if ( counter > 2) return false;
            if ( number % i == 0) counter++;
        }

        return true;

    }
}
