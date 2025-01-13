public class StringPalindrome {

    public static void main (String [] args) {
        String input = "Racecar";
        System.out.println(isPalindrome(input));
        System.out.println(isPalindromeNotReverse(input));
    }

    // Uses the .reverese() method
    public static boolean isPalindrome (String input){
        StringBuilder reverseInput = new StringBuilder(input);
        reverseInput.reverse();

        return input.equalsIgnoreCase(reverseInput.toString());

    }

    public static boolean isPalindromeNotReverse(String input) {
        return input.equalsIgnoreCase(reverseManual(input));
    }
    public static String reverseManual(String input){
        if(input == null || input.isEmpty()){
            return input;
        }

        return input.charAt(input.length()- 1)
                + reverseManual(input.substring(0, input.length() - 1));
    }
}
