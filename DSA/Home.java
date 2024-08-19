import java.util.Arrays;
import java.util.Scanner;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); // Create a Scanner object

//		System.out.println("Enter 1st Number");
//		int a = scan.nextInt(); // Read user input
//		System.out.println("Enter 2nd Number");
//		int b = scan.nextInt(); // Read user input
//		System.out.println("Sum: " + Calculations.Addition(a, b)); // Output user input
		
//		System.out.println("Enter Binary");
//		String binary = scan.nextLine();
//		System.out.println("Decimal: " + Calculations.binaryToDecimal(binary));
		
//		System.out.println("Enter Decimal");
//		int decimal = scan.nextInt();
//		System.out.println("Binary: " + Calculations.decimalToBinary(decimal));
		
		int[] list = { 1,2,3,4,5,6,7,8,9,10 };
		System.out.println("TwoSum: " + Arrays.toString(Calculations.twoSum(list, 12)));
		
		scan.close();
	}

}
