package lab3;

import java.util.Arrays;

public class Main3 {
	
	//enter values: 2 2 1
	public static void main(String[] args) {
			try {
				System.out.println(
						Arrays.toString(QuadraticEquation.getRoots(args)));
			} catch (QuadraticEquationException e) {
				e.printStackTrace();
			}
	}
}
