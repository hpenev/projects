package ifElseStatements;

import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number between[10..9999]: ");
		int liters = sc.nextInt();
		sc.close();

		if (liters >= 10 && liters <= 9999) {
			int count = liters / 5;
			int remaining = liters % 5;

			if (remaining == 0) {
				System.out.println(count + " times by 2 litre ");
				System.out.println(count + " times by 3 litre");
			}
			if (remaining == 1) {
				System.out.println(count - 1 + " times by 2 litre");
				System.out.println(count - 1 + " time by 3 litre");
				System.out.println("Additionally 2 buckets by 3 litre");
			}
			if (remaining == 2) {
				System.out.println(count + " times by 2 litre");
				System.out.println(count + " times by 3 litre");
				System.out.println("Additionally a bucket by 2 litre");
			}
			if (remaining == 3) {
				System.out.println(count + " times by 2 litre");
				System.out.println(count + " times by 3 litre");
				System.out.println("Additionally a bucket by 3 litre");
			}
			if (remaining == 4) {
				System.out.println(count + " times by 2 litre");
				System.out.println(count + " times by 3 litre");
				System.out.println("Additionally 2 buckets by 2 litre ");
			}

		} else {
			System.out.println("Wrong input");
		}
	}
}
