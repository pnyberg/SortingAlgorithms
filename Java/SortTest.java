public class SortTest {
	public static String testBubbleSort() {
		// the array-keys
		int[] arrayKey = {1, 2, 3, 4, 5};
		int[] arrayMultipleOfSameKey = {2, 2, 3, 3, 5};

		// the arrays to be tested
		int[] arrayInOrder = {1, 2, 3, 4, 5};
		int[] arrayReversedOrder = {5, 4, 3, 2, 1};
		int[] arrayRandomOrder = {2, 4, 3, 5, 1};
		int[] arrayMultipleSame = {2, 2, 3, 5, 3};

		// test the arrays and return false if they didn't work
		BubbleSort.sort(arrayInOrder);
		if (!equals(arrayKey, arrayInOrder)) {
			return "fails on already sorted set";
		}

		BubbleSort.sort(arrayReversedOrder);
		if (!equals(arrayKey, arrayReversedOrder)) {
			return "fails on reversed sorted set";
		}

		BubbleSort.sort(arrayRandomOrder);
		if (!equals(arrayKey, arrayRandomOrder)) {
			return "fails on randomly 'sorted' set";
		}

		BubbleSort.sort(arrayMultipleSame);
		if (!equals(arrayMultipleOfSameKey, arrayMultipleSame)) {
			return "fails on set with multiple equal values";
		}

		return "works fine";
	}

	public static boolean testInsertionSort() {
		// the array-keys
		int[] arrayKey = {1, 2, 3, 4, 5};
		int[] arrayMultipleOfSameKey = {2, 2, 3, 3, 5};

		// the arrays to be tested
		int[] arrayInOrder = {1, 2, 3, 4, 5};
		int[] arrayReversedOrder = {5, 4, 3, 2, 1};
		int[] arrayRandomOrder = {2, 4, 3, 5, 1};
		int[] arrayMultipleSame = {2, 2, 3, 5, 3};

		// test the arrays and return false if they didn't work
		InsertionSort.sort(arrayInOrder);
		if (!equals(arrayKey, arrayInOrder)) {
			return "fails on already sorted set";
		}

		InsertionSort.sort(arrayReversedOrder);
		if (!equals(arrayKey, arrayReversedOrder)) {
			return "fails on reversed sorted set";
		}

		InsertionSort.sort(arrayRandomOrder);
		if (!equals(arrayKey, arrayRandomOrder)) {
			return "fails on randomly 'sorted' set";
		}

		InsertionSort.sort(arrayMultipleSame);
		if (!equals(arrayMultipleOfSameKey, arrayMultipleSame)) {
			return "fails on set with multiple equal values";
		}

		return true;
	}

	public static boolean equals(int[] vector1, int[] vector2) {
		if (vector1.length != vector2.length) {
			return false;
		}

		for(int i = 0 ; i < vector1.length ; i++) {
			if (vector1[i] != vector2[i]) {
				return false;
			}
		}

		return "works fine";
	}

	// prints out the array in order
	public static void print(int[] vector) {
		System.out.print("[");
		for (int i = 0 ; i < vector.length ; i++) {
			System.out.print(vector[i]);
			if (i < vector.length - 1)
				System.out.print(",");
		}
		System.out.print("]");
	}

	public static void main(String[] arg) {
		System.out.println("Does Bubble Sort work: " + testBubbleSort());
		System.out.println("Does Insertion Sort work: " + testInsertionSort());
	}
}