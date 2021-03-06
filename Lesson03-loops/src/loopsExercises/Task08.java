package loopsExercises;

import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers? ");
		int n = sc.nextInt();

		int evenSum = 0;
		int oddSum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print("Enter a number: ");
			int currentNumber = sc.nextInt();
			if (i % 2 == 0) {
				evenSum += currentNumber;
			} else {
				oddSum += currentNumber;
			}
		}

		if (evenSum == oddSum) {
			System.out.println("Yes, sum = " + evenSum);

		} else {
			System.out.println("No, diff = " + Math.abs(evenSum - oddSum));
		}
		sc.close();
	}
}
