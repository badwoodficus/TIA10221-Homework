package homework5;

public class FindMax {
	private static int maxInt;
	private static double maxDouble;

	public FindMax() {

	}

	public int maxElement(int intArray[][]) {
		for (int[] row : intArray) {
			for (int value : row) {
				if (maxInt <= value) {
					maxInt = value;
				}
			}
		}
		return maxInt;
	}

	public double maxElement(double doubleArray[][]) {
		for (double[] row : doubleArray) {
			for (double value : row) {
				if (maxDouble <= value) {
					maxDouble = value;
				}
			}
		}
		return maxDouble;
	}

	public static void main(String[] args) {
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		FindMax work = new FindMax();
		System.out.println(work.maxElement(intArray));
		System.out.println(work.maxElement(doubleArray));
	}
}
