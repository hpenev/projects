package loopsExercisesAdvanced;

import java.util.Scanner;

//Write a program that introduces an even number. If the user enters the wrong number (odd number or string that is not an integer), an error message must be issued and entered again.
//Hints:
//� Enter a number in a loop and check if it is even. For a correct number, exit the cycle.
//� Try {...} catch {...} construct the wrong numbers that can not be invoked in integer.

public class Task11 {
	public static void main(String[] args) {

		int evenNumber;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter even number: ");

		while (true) {
			try {
				evenNumber = Integer.parseInt(sc.nextLine());
				if (evenNumber % 2 != 0) {
					System.out.println("The number is not even.");
					System.out.print("Enter even number: ");
					evenNumber = Integer.parseInt(sc.nextLine());
				} else {
					break;
				}

			} catch (Exception e) {
				System.out.println("Invalid number!");
				System.out.print("Enter even number: ");
			}
		}
		sc.close();
		System.out.print("Even number entered: " + evenNumber);
	}
}
