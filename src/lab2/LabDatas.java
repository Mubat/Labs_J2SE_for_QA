package lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class LabDatas {
	public enum Season {
		SUMMER, AUTUMN, WINTER, SPING
	};

	public enum Month {
		JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEPT, OCT, NOV, DEC
	}

	/** 1.1. */
	public static Set<Month> getMonthBySeason(Season season) {
		Set<Month> months = new HashSet<Month>();
		switch (season) {
		case SUMMER: {
			months.add(Month.JUN);
			months.add(Month.JUL);
			months.add(Month.AUG);
			break;
		}
		case AUTUMN: {
			months.add(Month.SEPT);
			months.add(Month.OCT);
			months.add(Month.NOV);
			break;
		}
		case WINTER: {
			months.add(Month.DEC);
			months.add(Month.JAN);
			months.add(Month.FEB);
			break;
		}
		case SPING: {
			months.add(Month.MAR);
			months.add(Month.APR);
			months.add(Month.MAY);
			break;
		}
		}
		return months;
	}

	/** 1.2. if absolut values is comparable, return one of them. */
	public static double absolutOfComparison(int value) {
		double sinCos = Math.abs(Math.sin(value) / Math.cos(value));
		double cosSin = Math.abs(Math.cos(value) / Math.sin(value));
		return Math.max(sinCos, cosSin);
	}

	/** 1.3. */
	public static int countElementsWithLengthByMod3(List<String> list) {
		int count = 0;
		Iterator<String> iteratorOfString = list.iterator();
		while (iteratorOfString.hasNext()) {
			if (iteratorOfString.next().length() % 3 == 0)
				count++;
		}
		return count;
	}

	/** 1.4. */
	public static List<String> deleteElementsWithLengthByMod3(List<String> list) {
		Iterator<String> iteratorOfString = list.iterator();
		while (iteratorOfString.hasNext()) {
			if (iteratorOfString.next().length() % 3 == 0)
				iteratorOfString.remove();
		}
		return list;
	}

	/** 1.5. */
	public static String drawStringWithoutStringsByMod3(List<String> list) {
		List<String> resultlisList = deleteElementsWithLengthByMod3(list);
		if (resultlisList.isEmpty())
			return "";

		StringBuilder stringbuilder = new StringBuilder();
		for (Iterator<String> iterator = resultlisList.iterator(); iterator
				.hasNext();) {
			stringbuilder.append((String) iterator.next());
		}

		return stringbuilder.toString();
	}

	/** 1.6. */
	public static List<Integer> convertToList(String[] mass) {
		if (mass.length == 0)
			return Collections.emptyList();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (String string : mass) {
			list.add(Integer.valueOf(string));
		}
		return list;
	}

	/** 1.7. */
	public static int[] convertToSortedArray(String[] mass) {
		List<Integer> list = convertToList(mass);
		Collections.sort(list);
		return toIntArray(list);
		/*//or
		return list.toArray(new Integer[list.size()]);
		//but then return type will be Integer[];
		*/
	}

	/** 1.8. */
	public static boolean isHaveAccess(Map<String, String> value) {
		if (value.isEmpty()) {
			System.err.println("Map is empty.");
			return false;
		}
		Set<Entry<String, String>> valueSet = value.entrySet();
		for (Entry<String, String> entry : valueSet) {
			if (entry.getKey().length() < entry.getValue().length())
				return true;
		}
		return false;
	}

	/** 1.9. */
	public static int[] arrayOfUniqueRandomNumbers(int count, int rightBorder) {
		if (rightBorder < count)
			System.err.println("Cann`t create array of unique random number "
					+ "bacause boundary is less than the amount");
		int[] mass = new int[count];
		Random random = new Random();
		for (int j = 0; j < mass.length; j++) {
			int tempNumber;
			do {
				tempNumber = random.nextInt(rightBorder);
			} while (checkNumbaerInArray(mass, tempNumber));
			mass[j] = tempNumber;
		}
		return mass;

	}

	private static boolean checkNumbaerInArray(int[] array, int value) {
		for (int i : array) {
			if (i == value)
				return true;
		}
		return false;
	}

	private static int[] toIntArray(List<Integer> list) {
		int[] ret = new int[list.size()];
		for (int i = 0; i < ret.length; i++)
			ret[i] = list.get(i);
		return ret;
	}

}
