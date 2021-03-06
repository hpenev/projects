package loopsHomework;

import java.util.Scanner;

public class Task24 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number in range[10 .. 30000]: ");
		int num = sc.nextInt();
		sc.close();

		if (num >= 10 && num <= 30000) {
			int remainder = 0;
			int divider = 100000;
			int digitsInNumber = 6;

			do {
				remainder = num / divider;
				if (remainder != 0) {
					break;
				}
				digitsInNumber--;
				divider /= 10;
			} while (true);

			boolean isPalindrome = true;

			int firstDigitDivider = digitsInNumber - 1;
			int lastDigitDivider = 0;

			do {
				int firstDigit = (num / (int) (Math.pow(10, firstDigitDivider))) % 10;
				int lastDigit = (num / (int) (Math.pow(10, lastDigitDivider))) % 10;

				if (firstDigit != lastDigit) {
					isPalindrome = false;
					break;
				}
				lastDigitDivider++;
				firstDigitDivider--;
			} while (firstDigitDivider > digitsInNumber / 2);
			System.out.println(isPalindrome ? "Number is a palindrome" : "Number is not a palindrome");
		} else {
			System.out.println("Wrong input");
		}

	}
}
