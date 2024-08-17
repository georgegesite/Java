
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
		boolean check = true;
		while(check) {
			if(decimal % base == 1) {
				binary = "1" + binary;
			} else {
				binary = "0" + binary;
			}
			decimal = decimal / base;
			if(decimal == 0) {
				check = false;
			}
		}
		
		return binary;
	}
}
