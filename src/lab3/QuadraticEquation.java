package lab3;

public class QuadraticEquation {
	public static double[] getRoots(String[] args) throws QuadraticEquationException {
		if (args.length != 3)
			throw new QuadraticEquationException("Array lenght is "
					+ args.length + ". But must have 3.");
		try {
			int a = Integer.parseInt(args[0]);
			if (a == 0)
				throw new QuadraticEquationException(
						"First element cannot be 0.");
			return getRoots(a, Integer.parseInt(args[1]),
					Integer.parseInt(args[2]));
		} catch (NumberFormatException e) {
			throw new QuadraticEquationException(
					"Cannot convert String to double.", e);
		}
	}

	private static double[] getRoots(double a, double b, double c)
			throws QuadraticEquationException {
		double diskriminant = b * b - 4 * a * c;
		if (diskriminant < 0)
			throw new QuadraticEquationException("Diskriminant is negative.");
		double[] results = new double[2];
		results[0] = (- b + Math.sqrt(diskriminant))/2 * a;
		results[0] = (- b - Math.sqrt(diskriminant))/2 * a;
		return results;
	}
}
