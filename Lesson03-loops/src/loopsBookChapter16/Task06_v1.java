package loopsBookChapter16;

import java.util.Scanner;

public class Task06_v1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���: ");
		int day = sc.nextInt();
		System.out.println("�������� �����: ");
		int month = sc.nextInt();
		System.out.println("�������� ������: ");
		int year = sc.nextInt();

		boolean leapYar = (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0));
		boolean correctData = true;

		if (day < 0 || day > 31) {
			correctData = false;
		}
		if (month < 0 || month > 12) {
			correctData = false;
		}
		if (year < 0) {
			correctData = false;
		}
		if (day == 29 && month == 2 && !leapYar) {
			correctData = false;
		}

		if (day == 28 && month == 2) {
			if (leapYar) {
				day++;
			} else {
				day = 1;
				month++;
			}
		} else if (day == 29 && month == 2 && leapYar) {
			day = 1;
			month++;
		} else if (day == 30) {
			switch (month) {
			case 1:
			case 2:
				correctData = false;
				break;
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day++;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				day = 1;
				month++;
				break;
			}
		} else if (day == 31) {
			if (month == 2) {
				correctData = false;
			}
			day = 1;
			if (month == 12) {
				month = 1;
				year++;
			} else {
				month++;
			}
		} else {
			day++;
		}
		if (correctData) {
			System.out.println("���������� ���� �");
			System.out.println(day + "." + month + "." + year);
		} else {
			System.out.println("��������� ����");
		}
	}

}
