package loopsHomework;

import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number [1...]: ");
		int number = sc.nextInt();
		sc.close();

		if (number > 0) {
			int sum = 0;
			for (int i = 1; i <= number; i++) {
				sum += i;
			}
			System.out.printf("Sum from 1 to %d is %d", number, sum);
		} else {
			System.out.println("Wrong input");
		}
	}
}
