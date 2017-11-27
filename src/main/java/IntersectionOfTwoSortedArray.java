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
	 * @param unused
	 *            unused input arguments
	 */
	@SuppressWarnings("checkstyle:magicnumber")
	public static void main(final String[] unused) {

		System.out.println("Find the intersection of two sorted arrays");
		int[][] testCases = { { 1, 2, 2, 3 }, { 2, 2, 3, 4 }, { 1, 3, 5, 9 }, { 6, 7, 8, 10 } };
		for (int i = 0; i < testCases.length - 1; i++) {
			test(testCases[i], testCases[i + 1]);
		}
	}

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
	 * The intersection of two sorted arrays
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
