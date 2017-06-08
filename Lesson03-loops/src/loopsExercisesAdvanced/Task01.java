package loopsExercisesAdvanced;

import java.util.Scanner;

// Write a program that enters a n number and prints the numbers from 1 to n through 3 (in step 3)
public class Task01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		int num = sc.nextInt();
		sc.close();

		if (num > 0) {
			for (int i = 1; i <= num; i += 3) {
				System.out.println(i);
			}
		} else {
			System.out.println("Wrong input");

		}
	}
}
