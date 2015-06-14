public class InsertionSort {
	public static void sort(int[] vector) {
		for (int n = 1 ; n < vector.length ; n++) {
			int k = n;
			for (; k > 0 && vector[k-1] > vector[n] ; k--) {}
			int temp = vector[n];
			for (int i = n ; i > k ; i--) {
				vector[i] = vector[i-1];
			}
			vector[k] = temp;
		}
	}
}