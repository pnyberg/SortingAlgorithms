import java.util.List;

public class InsertionSort {
	public static void sort(int[] vector) {
		for (int n = 1 ; n < vector.length ; n++) {
			int k = n;
			for (; k > 0 && vector[k-1] > vector[n] ; k--) { /* Do nothing */ }
			int temp = vector[n];
			for (int i = n ; i > k ; i--) {
				vector[i] = vector[i-1];
			}
			vector[k] = temp;
		}
	}

	public static void sort(List<Integer> list) {
		for (int n = 1 ; n < list.size() ; n++) {
			int k = n;
			int n_elem = list.get(n);
			for (; k > 0 && list.get(k-1) > n_elem ; k--) { /* Do nothing */ }
			for (int i = n ; i > k ; i--) {
				list.set(i, list.get(i-1));
			}
			list.set(k, n_elem);
		}
	}
}