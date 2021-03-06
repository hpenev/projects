package loopsExercises;

import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		double oddSum = 0;
		double oddMin = Double.MAX_VALUE;
		double oddMax = Double.MIN_VALUE;
		double evenSum = 0;
		double evenMin = Double.MAX_VALUE;
		double evenMax = Double.MIN_VALUE;

		for (int i = 1; i <= n; i++) {
			double currentNumber = sc.nextDouble();

			if (i % 2 == 0) {
				evenSum += currentNumber;

				if (currentNumber > evenMax) {
					evenMax = currentNumber;
				}

				if (currentNumber < evenMin) {
					evenMin = currentNumber;
				}
			}

			if (i % 2 != 0) {
				oddSum += currentNumber;

				if (currentNumber > oddMax) {
					oddMax = currentNumber;
				}

				if (currentNumber < oddMin) {
					oddMin = currentNumber;
				}
			}

		}

		System.out.printf("Oddsum = %f\n", oddSum);
		System.out.printf("OddMin = %f\n", oddMin);
		System.out.printf("OddMax = %f\n", oddMax);
		System.out.printf("EvenSum = %f\n", evenSum);
		System.out.printf("EvenMin = %f\n", evenMin);
		System.out.printf("EvenMax = %f\n", evenMax);

		sc.close();
	}
}
