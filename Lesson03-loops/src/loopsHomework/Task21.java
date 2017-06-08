package loopsHomework;

import java.util.Scanner;

public class Task21 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number [1..52]: ");
		int cardNumber = sc.nextInt();
		sc.close();

		if (cardNumber >= 1 && cardNumber <= 52) {
			for (int i = cardNumber; i <= 52; i++) {
				String color = "";

				int colorNumber = i % 4;
				switch (colorNumber) {
				case 0:
					color = "����";
					break;
				case 1:
					color = "������";
					break;
				case 2:
					color = "����";
					break;
				case 3:
					color = "����";
					break;
				default:
					color = "unknown color";
					break;
				}

				int weightNumber = (i - 1) / 4;
				String weight = "";

				switch (weightNumber) {
				case 0:
					weight = "2";
					break;
				case 1:
					weight = "3";
					break;
				case 2:
					weight = "4";
					break;
				case 3:
					weight = "5";
					break;
				case 4:
					weight = "6";
					break;
				case 5:
					weight = "7";
					break;
				case 6:
					weight = "8";
					break;
				case 7:
					weight = "9";
					break;
				case 8:
					weight = "10";
					break;
				case 9:
					weight = "����";
					break;
				case 10:
					weight = "����";
					break;
				case 11:
					weight = "���";
					break;
				case 12:
					weight = "���";
					break;
				}

				if (i != 52) {
					System.out.printf("%s %s, ", weight, color);
				} else {
					System.out.printf("%s %s", weight, color);
				}
			}
		} else {
			System.out.println("Wrong input");
		}
	}

	// private static String cardColor(int cardNumber) {
	// String color = "";
	//
	// int colorNumber = cardNumber % 4;
	// switch (colorNumber) {
	// case 0:
	// color = "����";
	// break;
	// case 1:
	// color = "������";
	// break;
	// case 2:
	// color = "����";
	// break;
	// case 3:
	// color = "����";
	// break;
	// }
	// return color;
	// }
	//
	// private static String cardWeight(int cardNumber) {
	// int weightNumber = (cardNumber - 1) / 4;
	// String weight = "";
	//
	// switch (weightNumber) {
	// case 0:
	// weight = "2";
	// break;
	// case 1:
	// weight = "3";
	// break;
	// case 2:
	// weight = "4";
	// break;
	// case 3:
	// weight = "5";
	// break;
	// case 4:
	// weight = "6";
	// break;
	// case 5:
	// weight = "7";
	// break;
	// case 6:
	// weight = "8";
	// break;
	// case 7:
	// weight = "9";
	// break;
	// case 8:
	// weight = "10";
	// break;
	// case 9:
	// weight = "����";
	// break;
	// case 10:
	// weight = "����";
	// break;
	// case 11:
	// weight = "���";
	// break;
	// case 12:
	// weight = "���";
	// break;
	// }
	//
	// return weight;
	// }
}
