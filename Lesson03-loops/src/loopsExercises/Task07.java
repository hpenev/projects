package loopsExercises;

import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers ?");
		int n = sc.nextInt();

		int leftSum = 0;
		int rightSum = 0;
		for (int i = 1; i <= 2 * n; i++) {
			System.out.print("Enter a number: ");
			int currentNumber = sc.nextInt();
			if (i <= n) {
				leftSum += currentNumber;
			} else {
				rightSum += currentNumber;
			}
		}

		if (leftSum == rightSum) {
			System.out.println("Yes, sum = " + leftSum);

		} else {
			System.out.println("No, diff = " + Math.abs(leftSum - rightSum));
		}
		sc.close();
	}
}
