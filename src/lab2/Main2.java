package lab2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

//input string: link jav kdjbf omg lonely git refactor new born scorpions
public class Main2 extends LabDatas {
	private static Scanner in = new Scanner(System.in);
	private static String[] stringMass = new String[] { "-3", "2", "4", "324",
			"0", "-3", "-435" };

	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Array of input strings cannot be empty.");
			System.exit(0);
		}

		System.out.println("1.1. Get AUTUMN months: "
				+ getMonthBySeason(Season.AUTUMN));
		System.out.println("\n1.2. Enter parameter value");
		System.out.println("result = "
				+ absolutOfComparison(Integer.parseInt(in.nextLine())));

		System.out.println("\n1.3. "
				+ countElementsWithLengthByMod3(Arrays.asList(args)));
		System.out.println("\n1.4. "
				+ deleteElementsWithLengthByMod3(new LinkedList<String>(Arrays
						.asList(args))));
		System.out.println("\n1.5. "
				+ (new LinkedList<String>(Arrays.asList(args))));
		System.out.println("\n1.6. " + convertToList(stringMass));
		System.out.println("\n1.7. "
				+ Arrays.toString(convertToSortedArray(stringMass)));
		System.out.println("\n1.8. " + isHaveAccess(createPasswords(args)));
		System.out.println("\n1.9. "
				+ Arrays.toString(arrayOfUniqueRandomNumbers(20, 30)));
	}

	private static Map<String, String> createPasswords(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		for (String string : args) {
			System.out.println("Enter password for value[" + string + "]: ");
			map.put(string, in.nextLine());
		}
		return map;
	}

}
