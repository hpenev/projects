package inClass;

import java.util.Arrays;

public class arrCopying {
    public static void main(String[] args) {
	int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
	int[] copy = new int[original.length];

	for (int i = 0; i < original.length; i++) {
	    copy[i] = original[i];
	}

	System.out.println(Arrays.toString(original));
	System.out.println(Arrays.toString(copy));

    }
}
