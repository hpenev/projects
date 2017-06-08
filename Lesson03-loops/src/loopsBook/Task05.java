package loopsBook;

import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive numer: ");
		int p = sc.nextInt();
		System.out.print("Enter a positive numer: ");
		int q = sc.nextInt();
		sc.close();

		if (p > 0 && q > 0) {
			// row
			for (int i = 1; i <= p; i++) {
				// column
				for (int j = 1; j <= q; j++) {
					System.out.printf("%d%d ", i, j);
				}
				System.out.println();
			}
		} else {
			System.out.println("Wrong input");

		}
	}
}
