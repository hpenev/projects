package loopsExercisesAdvanced;

import java.util.Scanner;

//Write a program that reads from the console an integer n and prints the numbers from 1 to 2n
public class Task03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		int num = sc.nextInt();
		sc.close();

		int n = 1;

		if (num > 0) {
			for (int i = 0; i <= num; i++) {
				System.out.println(n);
				n *= 2;
			}
		}
	}
}
