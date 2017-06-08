package loopsBook;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		int num = sc.nextInt();
		sc.close();

		int sum = 0;

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
			System.out.println(sum);
		} else {
			System.out.println("Wrong number");
		}
	}
}
