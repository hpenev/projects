package ifElseStatements;

import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int a = sc.nextInt();
		System.out.println("Enter a different integer: ");
		int b = sc.nextInt();
		sc.close();

		if (a != b) {
			if (a < b) {
				System.out.printf("%d %d", a, b);
			}

			if (b < a) {
				System.out.printf("%d %d", b, a);
			}
		} else {
			System.out.println("Wrong input");

		}
	}
}
