package loopsExercisesAdvanced;

import java.util.Scanner;

//Write a program that enters an integer n and calculates the Fibonacci n-number. The zero number of Fibonacci is 1, the first one is also 1, and each one is the sum of the previous two.
//Hint:
//� At n <2, print 1.
//� Start from f0 = 1 and f1 = 1 and in the loop you sum up the last two numbers. Record the last two numbers after each step in f0 and f1.

public class Task12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter wanted fibonacci number: ");
		int number = sc.nextInt();
		sc.close();

		int fibonacci = 1;
		int f0 = 1;
		int f1 = 1;

		if (number > 1) {
			for (int i = 2; i <= number; i++) {
				fibonacci = f0 + f1;
				f0 = f1;
				f1 = fibonacci;
			}
		}

		System.out.println(number + "th fibonacci number is " + fibonacci);

	}
}
