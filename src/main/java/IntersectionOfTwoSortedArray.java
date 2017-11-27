/**
 * Class printing out the intersection of two sorted arrays.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/12/">Lab 12 Description</a>
 */
public class IntersectionOfTwoSortedArray {
	/**
	 * Main method for testing.
	 * <p>
	 * This method prints out the intersection of two sorted arrays.
	 *
	 * @param args
	 *            input arrays for testing
	 */
	@SuppressWarnings("checkstyle:magicnumber")
	public static void main(final String[] args) {
		System.out.println("Find the intersection of two sorted arrays");
		if (args.length == 0) {
			System.out.println("Running provided test cases.");
			int[][] testCases = { { 1, 2, 2, 3 }, { 2, 2, 3, 4 }, { 1, 3, 5, 9 }, { 6, 7, 8, 10 } };
			for (int i = 0; i < testCases.length - 1; i++) {
				test(testCases[i], testCases[i + 1]);
			}
		} else if (args.length == 2) {
			String[] splits1 = args[0].split(" ");
			String[] splits2 = args[1].split(" ");
			int[] array1 = new int[splits1.length];
			for (int i = 0; i < array1.length; i++) {
				array1[i] = Integer.parseInt(splits1[i]);
			}
			int[] array2 = new int[splits2.length];
			for (int i = 0; i < array2.length; i++) {
				array2[i] = Integer.parseInt(splits2[i]);
			}
			test(array1, array2);
		} else {
			System.out.println("Please input two sorted arrays");
		}
	}

	/**
	 * Test for finding intersection of two sorted arrays
	 *
	 * @param array1
	 *            sorted input array1
	 * @param array2
	 *            sorted input array2
	 */
	private static void test(final int[] array1, final int[] array2) {
		int[] intersection = intersection(array1, array2);
		intersection = intersection(array1, array2);
		if (intersection == null || intersection.length == 0) {
			System.out.print("No intersections.");
		}
		for (int num : intersection) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	/**
	 * The intersection of two sorted arrays. Implement this method.
	 *
	 * @param array1
	 *            sorted input array1
	 * @param array2
	 *            sorted input array2
	 * @return the intersection of the two arrays, empty array is no intersection
	 */
	public static int[] intersection(final int[] array1, final int[] array2) {
		return new int[0];
	}
}
