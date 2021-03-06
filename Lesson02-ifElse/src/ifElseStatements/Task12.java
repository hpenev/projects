package ifElseStatements;

import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter day:");
		int day = sc.nextInt();
		System.out.print("enter month:");
		int month = sc.nextInt();
		System.out.print("enter year:");
		int year = sc.nextInt();
		sc.close();

		if (day > 0 && day < 32 && month > 0 && month < 13) {
			boolean isYearKratnaNa4 = year % 4 == 0;
			boolean isCentury = year % 100 == 0;
			boolean isCentury400 = year % 400 == 0;

			boolean isLeapYear = false;

			if (isYearKratnaNa4 && !isCentury && isCentury400) {
				isLeapYear = true;
			}

			if (((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day == 31)
					|| ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30)
					|| (month == 2 && day == 28 && !isLeapYear) || (month == 2 && isLeapYear && day == 29)) {
				month += 1;
				day = 1;
			} else if (month == 12 && day == 31) {
				month = 1;
				day = 1;
				year += 1;
			} else {
				day += 1;
			}

			System.out.printf("Next day is %d.%d.%d", day, month, year);
		} else {
			System.out.println("Wrong input");
		}

	}
}
