package loopsHomework;

import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		sc.close();

		if (num > 0) {
			boolean isNumEven = num % 2 == 0;
			int startNumber = num - 1;

			for (int i = 1; i <= num * 2; i++) {
				if (isNumEven && i % 2 != 0) {
					for (int j = 1; j <= num; j++) {
						System.out.print(startNumber);
					}
					startNumber += 2;
				}
				if (!isNumEven && i % 2 == 0) {
					for (int j = 1; j <= num; j++) {
						System.out.print(startNumber);
					}
					startNumber += 2;
				}
				System.out.println();
			}
		} else {
			System.out.println("Wring input");
		}
	}
}
