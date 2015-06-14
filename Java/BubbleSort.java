public class BubbleSort {
	public static void sort(int[] vector) {
		int size = vector.length;

		for(; size > 1 ; size--) {
			int highestIndex = 0;
			for(int n = 1 ; n < size ; n++) {
				if (vector[n] > vector[highestIndex]) {
					highestIndex = n;
				}
			}
			int temp = vector[size-1];
			vector[size-1] = vector[highestIndex];
			vector[highestIndex] = temp;
		}
	}
}