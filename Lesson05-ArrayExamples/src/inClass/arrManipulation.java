package inClass;

import java.util.Arrays;
import java.util.Scanner;

public class arrManipulation {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number for array: ");
	int x = sc.nextInt();
	sc.close();

	if (x < 1) {
	    System.out.println("Wrong input");
	    return;
	}

	int[] arr = new int[x];

	for (int i = 0; i < arr.length; i++) {
	    arr[i] = i * i * i;
	}

	for (int i = 0; i < arr.length; i++) {
	    System.out.print(arr[i] + " ");

	}

	System.out.println(Arrays.toString(arr));

    }
}
