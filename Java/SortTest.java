public class SortTest {
	public static boolean testBubbleSort() {
		// the array-keys
		int[] arrayKey = {1, 2, 3, 4, 5};
		int[] arrayMultipleSameKey = {2, 2, 3, 3, 5};

		// the arrays to be tested
		int[] arrayInOrder = {1, 2, 3, 4, 5};
		int[] arrayReversedOrder = {5, 4, 3, 2, 1};
		int[] arrayRandomOrder = {2, 4, 3, 5, 1};
		int[] arrayMultipleSame = {2, 2, 3, 5, 3};

		// test the arrays and return false if they didn't work
		BubbleSort.sort(arrayInOrder);
		if (!equals(arrayKey, arrayInOrder)) {
			return false;
		}

		BubbleSort.sort(arrayReversedOrder);
		if (!equals(arrayKey, arrayReversedOrder)) {
			return false;
		}

		BubbleSort.sort(arrayRandomOrder);
		if (!equals(arrayKey, arrayRandomOrder)) {
			return false;
		}

		BubbleSort.sort(arrayMultipleSame);
		if (!equals(arrayMultipleSameKey, arrayMultipleSame)) {
			return false;
		}

		return true;
	}

	public static boolean testInsertionSort() {
		// the array-keys
		int[] arrayKey = {1, 2, 3, 4, 5};
		int[] arrayMultipleSameKey = {2, 2, 3, 3, 5};

		// the arrays to be tested
		int[] arrayInOrder = {1, 2, 3, 4, 5};
		int[] arrayReversedOrder = {5, 4, 3, 2, 1};
		int[] arrayRandomOrder = {2, 4, 3, 5, 1};
		int[] arrayMultipleSame = {2, 2, 3, 5, 3};

		// test the arrays and return false if they didn't work
		InsertionSort.sort(arrayInOrder);
		if (!equals(arrayKey, arrayInOrder)) {
			return false;
		}

		InsertionSort.sort(arrayReversedOrder);
		if (!equals(arrayKey, arrayReversedOrder)) {
			return false;
		}

		InsertionSort.sort(arrayRandomOrder);
		if (!equals(arrayKey, arrayRandomOrder)) {
			return false;
		}

		InsertionSort.sort(arrayMultipleSame);
		if (!equals(arrayMultipleSameKey, arrayMultipleSame)) {
			return false;
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
		return true;
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