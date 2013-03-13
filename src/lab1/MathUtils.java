package lab1;

public class MathUtils {

	/**
	 * For a given array, and setting X calculate and return the amount
	 * Elements, multiple X
	 * 
	 * @param mass
	 *            entared array
	 * @param modValue
	 *            module Number
	 * @return summery of value by massiv modulo modValue
	 */
	public static int summaryByMod(int[] mass, int modValue) throws ArithmeticException {
		if (modValue == 0) {
			throw new ArithmeticException("Mod value cannot be 0.");
		}
		int summary = 0;
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] % modValue == 0)
				summary += mass[i];
		}
		return summary;
	}

	/**
	 * In this case, use the ternary conditional operator
	 * 
	 * @param value
	 *            number
	 * @return the output is a "Positiv", if the input parameter is greater than
	 *         0, "Negative" - ​​less than zero, and "Zero" - if 0.
	 */
	public static String comparePositive(int value) {
		return value > 0 ? "Positiv" : value == 0 ? "Zero"
				: "Negative";
	}

	/**
	 * At the output of the function to return the result of step 2. If the
	 * input is another number that is not equal to -1, 0 or 1 - "Error"
	 * 
	 * @param value
	 *            input number like is -1, 0, 1
	 * @return same as comparePositive(int value) but if value is not -1, 0 or
	 *         1, return "Error"
	 */
	public static String comparePositiveWithError(int value) {
		switch (value) {
		case -1:
		case 0:
		case 1:
			return comparePositive(value);
		}
		return "Error";
	}

	/**
	 * For a given array, and setting X calculate and return the amount
	 * Elements, multiple X.
	 * 
	 * @see summaryByMod(int[] mass, int modValue)
	 * @param mass
	 *            entared array
	 * @return summery of value by massiv modulo 2
	 */
	public static int summaryByMod(int[] mass) {
		return summaryByMod(mass, 2);
	}

	/**
	 * product of arrays
	 * 
	 * @param mass1
	 *            entered array1
	 * @param mass2
	 *            entered array2
	 * @return scalar product of arrays
	 * @throws ArithmeticException
	 *             when ented arrays has same length.
	 */
	public static double scalarProduct(int[] mass1, int[] mass2)
			throws ArithmeticException {
		if (mass1.length != mass2.length)
			throw new ArithmeticException("Arrays should have the same length.");
		double result = 0;
		int i = 0;
		for (int element : mass1) {
			result += element * mass2[i++];
		}
		return result;
	}

	/**
	 * For a given array Calculate the sum of the positive elements of the array
	 * and some negative (Use a loop while). Return
	 * 
	 * @param mass
	 *            entarad mass
	 * @return the result of integer division of the sum Positive to negative
	 */
	public static double divisionPositivesByNegatives(int[] mass) {
		if (mass.length == 0)
			System.err.println("Cann`t make a calculation: "
					+ "division positive elements of massiv by negative.");
		double positives = 0, negatives = 0;
		int i = 0;
		while (mass.length < i) {
			if (mass[i] < 0)
				negatives += mass[i];
			else 
				positives += mass[i];
			i++;
		}
		
		return (positives != 0 & negatives != 0) ? (positives / negatives) : 0;
	}
}
