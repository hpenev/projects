package loopsHomework;

public class Task23 {
	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 1;

		while (num1 < 10) {
			System.out.printf("%d row: ", num1);
			while (num2 < 10) {
				System.out.printf("%d*%d; ", num1, num2);
				num2++;
			}
			System.out.println();

			num1++;
			num2 = num1;
		}

	}
}
