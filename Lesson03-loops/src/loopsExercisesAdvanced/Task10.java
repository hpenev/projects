package loopsExercisesAdvanced;
//Write a program that enters an integer n and checks whether it is a prime number (whether it is divided by itself or per unit). Print "Prime" or "Not prime".

import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		sc.close();

		boolean isPrime = true;

		if (number < 2) {
			isPrime = false;
		}

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}

		System.out.println(isPrime ? "Prime" : "Not prime");
	}
}
