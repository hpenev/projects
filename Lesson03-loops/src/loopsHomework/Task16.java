package loopsHomework;

import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number [10..5555]:");
		int n = sc.nextInt();
		System.out.print("Enter a number [10..5555]:");
		int m = sc.nextInt();
		sc.close();

		if (n >= 10 && n <= 5555 && m >= 10 && m <= 5555) {
			for (int i = Math.max(n, m); i >= Math.min(n, m); i--) {
				if (i % 50 == 0) {
					System.out.print(i + " ");
				}
			}
		} else {
			System.out.println("Wrong input");
		}
	}
}