import java.util.HashMap;

public class Calculations {

	/**
	 * Get Sum of 2 numbers
	 * 
	 * @param a
	 * @param b
	 * @return sum
	 */
	public static int Addition(int a, int b) {
		return a + b;
	}
	
	/**
	 * Convert binary to Decimal
	 * 
	 * 
	 * @param binary
	 * @return Decimal
	 */
	public static int binaryToDecimal(String binary) {
		int decimal = 0;
		int exponent = 0;
		int base = 2;
		
		// convert String to char array
		char[] charArray = binary.toCharArray();
		int length = binary.length();
		for(int i = length -1 ; i >= 0; i--) {
			if(charArray[i] == '1') {
				double result = Math.pow(base, exponent);
				decimal += result;
			}
			exponent++;
		}
		
		return decimal;
	}
	
	/**
	 * Convert Decimal to Binary
	 * 
	 * @param decimal
	 * @return binary
	 */
	public static String decimalToBinary(int decimal) {
		String binary = "";
		int base = 2;
		while(decimal != 0) {
			if(decimal % base == 1) {
				binary = "1" + binary;
			} else {
				binary = "0" + binary;
			}
			decimal = decimal / base;
		}
		
		return binary;
	}
	
	/**
	 * Two Sum Leetcode Question
	 * 
	 * @param numberList
	 * @param target
	 * @return indexes of points
	 */
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            map.put(nums[i], i);
        }
        
        // If no solution is found
        return new int[0];
    }
}
