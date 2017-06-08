package ifElseStatements;

import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 digit number (number should not contain 0(zero)): ");
		int num = sc.nextInt();
		sc.close();

		int tempNum = num;
		int num3 = tempNum % 10;
		tempNum /= 10;
		int num2 = tempNum % 10;
		tempNum /= 10;
		int num1 = tempNum % 10;

		if (num1 != 0 && num2 != 0 && num3 != 0) {
			boolean firshCheck = num % num1 == 0;
			boolean secondCheck = num % num2 == 0;
			boolean thirdCheck = num % num3 == 0;

			if (firshCheck && secondCheck && thirdCheck) {
				System.out.println("The number is divided by each digit");
			} else {
				System.out.println("The number is not divided by each digit");
			}
		} else {
			System.out.println("Wrong input");
		}

	}
}
