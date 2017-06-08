package loopsHomework;

import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		System.out.print("Enter different number: ");
		int b = sc.nextInt();
		sc.close();

		int min = 0;
		int max = 0;

		if (a != b) {
			if (a > b) {
				max = a;
				min = b;
			} else {
				max = b;
				min = a;
			}

			for (int i = min; i <= max; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("Wrong input");
		}
	}
}
