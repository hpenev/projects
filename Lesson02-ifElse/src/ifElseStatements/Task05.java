package ifElseStatements;

import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int a = sc.nextInt();
		System.out.print("Enter an integer: ");
		int b = sc.nextInt();
		System.out.print("Enter an integer: ");
		int c = sc.nextInt();
		sc.close();

		if (a != b && b != c && a != c) {
			if (a > b && b > c) {
				System.out.printf("%d > %d > %d", a, b, c);
			}

			if (a > c && c > b) {
				System.out.printf("%d > %d > %d", a, c, c);
			}

			if (b > a && a > c) {
				System.out.printf("%d > %d > %d", b, a, c);
			}

			if (b > c && c > a) {
				System.out.printf("%d > %d > %d", b, c, a);
			}

			if (c > a && a > b) {
				System.out.printf("%d > %d > %d", c, a, b);
			}

			if (c > b && b > a) {
				System.out.printf("%d > %d > %d", c, b, a);
			}
		} else {
			System.out.println("Wrong input");

		}
	}
}
