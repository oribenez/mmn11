import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		//Declare and init constants
		final int LOWEST_NUMBER = 1000;
		final int HIGHEST_NUMBER = 9999;
		final int REVERSE_SIGN = -1;
		
		Scanner scan = new Scanner(System.in); // Create new scanner object
		
		System.out.print("Please enter a 4 digit number: "); // Ask from the user 4 digit number
		int num = scan.nextInt(); // reads 4 digits number from user // 4359

		if ((num >= LOWEST_NUMBER && num <= HIGHEST_NUMBER) || (num <= LOWEST_NUMBER*(-1) && num >= HIGHEST_NUMBER*(-1))) { // checks if the number is 4 digit
			// print menu for the user
			System.out.print("1. Reverse sign. \n2. Reverse number. \n3. Reverse sign and number.\nPlease choose an option: ");

			// use arithmetic solution in order to get each digit separately
			//                      9                      5                     3                   4
			int reverseNum = (num % 10 * 1000) + (num % 100 / 10 * 100) + (num / 100 % 10 * 10) + (num / 1000);
			int optionNum = scan.nextInt(); // reads option number (1,2,3) from the user

			switch (optionNum) {
				case 1 : // user choose option 1
					// prints the opposite number sign
					System.out.println("\nThe result is:\n" + (num * REVERSE_SIGN));
					break;
				case 2: // user choose option 2
					// Print the number on the opposite order
					System.out.println("\nThe result is:\n" + reverseNum);
					break;
				case 3: // user choose option 3
					// Print the number on the opposite order and sign
					System.out.println("\nThe result is:\n" + (reverseNum * REVERSE_SIGN));
					break;
				default: // user chose invalid number
					System.out.println("Illegal option – you must choose 1, 2 or 3");
			}
		} else { // user entered an illegal number
			System.out.println("Illegal number – you must enter a 4 digit number");
		}
	}
}
