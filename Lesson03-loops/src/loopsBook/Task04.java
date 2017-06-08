package loopsBook;

import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive number: ");

		int num = sc.nextInt();
		sc.close();

		if (num > 0) {

			boolean isPrime = true;

			for (int i = 2; i < num; i++) {
				if ((num % i == 0)) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.println("Number is Prime");

			} else {
				System.out.println("Number is not prime");

			}
		} else {
			System.out.println("Wrong input");
		}
	}
}
