package loopsHomework;

import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number for tree:");
		int col = sc.nextInt();
		sc.close();
		if (col > 0) {
			for (int row = 1; row <= col; row++) {

				for (int s = col - row; s > 0; s--) {
					System.out.print(" ");
				}

				for (int z = 1; z <= 2 * row - 1; z++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.println("Wrong input");

		}

	}
}
