package loopsHomework;

import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive number: ");

		int num = sc.nextInt();
		sc.close();

		if (num > 1) {
			int sum = 0;
			int count = 1;
			do {
				sum += count;
				count++;
			} while (count <= num);

			// for (int i = 1; i <= num; i++) {
			// sum += i;
			// }

			System.out.println("Sum is " + sum);

		} else {
			System.out.println("Wrong input");
		}
	}
}
