package lab1;

import java.util.Scanner;

public class Main extends MathUtils {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter length of array: ");
		int length = 0;
		do {
			length = in.nextInt();
		} while (length <= 0);

		System.out.println("Enter array.");
		int[] massiv1 = enterArray(length);
		System.out.println("Enter module value: ");
		int mod = in.nextInt();

		System.out.println("1.1. " + summaryByMod(massiv1, mod));
		System.out.println("1.2. "
				+ comparePositive(massiv1[massiv1.length - 1]));
		System.out.println("1.3. "
				+ comparePositive(massiv1[massiv1.length - 1]));
		System.out.println("1.4. " + summaryByMod(massiv1));

		System.out.println("1.5. Enter new massiv.");
		int[] mass2 = enterArray(length);
		System.out.println("Result of 1.5. " + scalarProduct(massiv1, mass2));
		System.out.println("1.6. " + divisionPositivesByNegatives(mass2));

	}

	private static int[] enterArray(int length) {
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			System.out.println("\tEnter mas[" + i + "]: ");
			array[i] = in.nextInt();
		}
		return array;
	}

}
