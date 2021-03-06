package loopsExercises;

import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sum = 0;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			int currNum = sc.nextInt();
			sum += currNum;

			if (currNum > max) {
				max = currNum;
			}

		}

		sum -= max;
		if (sum == max) {
			System.out.println("Yes Sum = " + sum);

		} else {
			System.out.println("No, diff = " + Math.abs(sum - max));

		}
		sc.close();
	}
}
